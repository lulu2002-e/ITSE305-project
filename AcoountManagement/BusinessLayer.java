public class BusinessLayer {
    // using DataLayer class to interact with the data storage
    private DataLayer data = new DataLayer();

    // handle user registration
    public boolean register(String email, String password) {
        return data.registerUser(email, password);
    }

    // handle user login
    public boolean login(String email, String password) {
        return data.loginUser(email, password);
    }

    // handle profile editing and update the user's profile
    public boolean editProfile(String email, String newPassword) {
        return data.profileEdit(email, newPassword);
    }
}