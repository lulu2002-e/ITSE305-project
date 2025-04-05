package org.example;
public class AccountBL {
    private AccountDL data = new AccountDL();

    // connect the 3 services to the data layer
    public boolean register(String email, String password) {
        return data.registerUser(email, password);
    }
    public boolean login(String email, String password) {
        return data.loginUser(email, password);
    }
    public boolean editProfile(String email, String newPassword) {
        return data.profileEdit(email, newPassword);
    }
}