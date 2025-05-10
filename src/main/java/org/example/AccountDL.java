package org.example;

import java.sql.*;
import java.util.Base64;

// db connection tester nth important
public class AccountDL {
  // make a database connection
  private Connection connect() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      throw new SQLException("MySQL Driver not found!", e);
    }
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
  }

  // Simple password encoding method to improve security
  private String encodePassword(String password) {
    String saltedPassword = "Thisclinic_" + password + "_salt";
    return Base64.getEncoder().encodeToString(saltedPassword.getBytes());
  }

  // 3 boolean methods to ensure registration, login, and profile edit are successful
  public boolean registerUser(String email, String password) {
    String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
    try (Connection conn = connect();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
      System.out.println("Attempting to register user: " + email);

      String encodedPassword = encodePassword(password);
      
      stmt.setString(1, email);
      stmt.setString(2, encodedPassword);

      // execute and return true if a row was inserted
      return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
      System.out.println("Registration failed for user: " + email + " - Error: " + e.getMessage());
      if (e.getMessage().contains("Duplicate")) {
        System.out.println("This email is already registered in the system.");
      } else if (e.getMessage().contains("Connection")) {
        System.out.println("Database connection issue. Please check your database settings.");
      } else {
        System.out.println("Unexpected database error during registration.");
      }
      return false;
    }
  }

  public boolean loginUser(String email, String password) {
    String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
    try (Connection conn = connect();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
      
      String encodedPassword = encodePassword(password);
      
      stmt.setString(1, email);
      stmt.setString(2, encodedPassword);
      // execute and return true if a matching row is found
      ResultSet rs = stmt.executeQuery();
      return rs.next();
    } catch (SQLException e) {
      System.out.println("Login failed for user: " + email + " - Error: " + e.getMessage());
      if (e.getMessage().contains("Connection")) {
        System.out.println("Database connection issue. Please check your database settings.");
      } else {
        System.out.println("Unexpected database error during login attempt.");
      }
      return false;
    }
  }

  public boolean profileEdit(String email, String newPassword) {
    String sql = "UPDATE users SET password = ? WHERE email = ?";
    try (Connection conn = connect();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
      
      String encodedPassword = encodePassword(newPassword);
      
      stmt.setString(1, encodedPassword);
      stmt.setString(2, email);
      // execute and return true if a row was updated
      int rowsUpdated = stmt.executeUpdate();
      if (rowsUpdated == 0) {
        System.out.println("Profile update failed: User with email " + email + " not found.");
      }
      return rowsUpdated > 0;
    } catch (SQLException e) {
      System.out.println("Profile update failed for user: " + email + " - Error: " + e.getMessage());
      if (e.getMessage().contains("Connection")) {
        System.out.println("Database connection issue. Please check your database settings.");
      } else {
        System.out.println("Unexpected database error during profile update.");
      }
      return false;
    }
  }
}
