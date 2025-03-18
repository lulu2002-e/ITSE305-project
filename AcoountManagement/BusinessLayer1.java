public class BusinessLayer1 {
    private DataLayer1 data = new DataLayer1();

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