import java.sql.*;
// db connection tester nth important
public class DataLayer1 {
    // make a database connection
    private Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found!", e);
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
    }
    
    // 3 boolean methods to ensure registration, login, and profile edit are successful
    public boolean registerUser(String email, String password) {
        String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            System.out.println("Attempting to register user: " + email);

            stmt.setString(1, email);
            stmt.setString(2, password);
            
            // execute and return true if a row was inserted
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Exception in registerUser: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean loginUser(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            // execute and return true if a matching row is found
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean profileEdit(String email, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE email = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newPassword);
            stmt.setString(2, email);
            // execute and return true if a row was updated
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
