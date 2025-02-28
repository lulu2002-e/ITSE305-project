public class BusinessLayer {
    // Create an instance of DataLayer class
    private DataLayer data = new DataLayer();

    // handle user registration
    public boolean register(String email, String password) {
        return data.registerUser(email, password);
    }

    // handle user login
    public boolean login(String email, String password) {
        return data.loginUser(email, password);
    }

    // handle edit profile
    public boolean editProfile(String email, String newPassword) {
        return data.profileEdit(email, newPassword);
    }
}