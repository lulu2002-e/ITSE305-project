package org.example;

import java.util.Scanner;

public class AccountPL {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AccountBL service = new AccountBL();

    try {
      System.out.println("Choose a number from the following options:");
      System.out.println("1. Register\n2. Login\n3. Edit Profile");
      // store choice
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> {
          System.out.print("Enter Email: ");
          String email = scanner.nextLine();
          System.out.print("Enter Password: ");
          String password = scanner.nextLine();
          
          // Basic input validation
          if (email.isEmpty() || password.isEmpty()) {
            System.out.println("Registration Failed: Email and password cannot be empty");
          } else {
            System.out.println(
                service.register(email, password)
                    ? "Registration Successful"
                    : "Registration Failed");
          }
        }
        case 2 -> {
          System.out.print("Enter Email: ");
          String email = scanner.nextLine();
          System.out.print("Enter Password: ");
          String password = scanner.nextLine();
          
          // Basic input validation
          if (email.isEmpty() || password.isEmpty()) {
            System.out.println("Login Failed: Email and password cannot be empty");
          } else {
            System.out.println(
                service.login(email, password) ? "Login Successful" : "Invalid Credentials");
          }
        }
        case 3 -> {
          System.out.print("Enter Email: ");
          String email = scanner.nextLine();
          System.out.print("Enter New Password: ");
          String newPassword = scanner.nextLine();
          
          // Basic input validation
          if (email.isEmpty() || newPassword.isEmpty()) {
            System.out.println("Update Failed: Email and new password cannot be empty");
          } else {
            System.out.println(
                service.editProfile(email, newPassword) ? "Profile Updated" : "Update Failed");
          }
        }
        default -> System.out.println("Invalid Choice");
      }
    } finally {
      // Close the scanner when done to prevent resource leaks
      scanner.close();
    }
  }
}
