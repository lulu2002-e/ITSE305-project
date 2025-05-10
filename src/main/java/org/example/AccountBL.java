package org.example;

public class AccountBL {

  /** Handles data layer operations for user accounts. */
  private final AccountDL accountDL = new AccountDL();

  // Provides methods for user registration, login, and profile editing
  public boolean register(String email, String password) {
    return accountDL.registerUser(email, password);
  }

  public boolean login(String email, String password) {
    return accountDL.loginUser(email, password);
  }

  public boolean editProfile(String email, String newPassword) {
    return accountDL.profileEdit(email, newPassword);
  }
}
