import java.util.Scanner;

public class PresentationLayer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an instance of BusinessLayer class
        BusinessLayer1 service = new BusinessLayer1();

        // Display the use case options to the user
        System.out.println("Choose a number from the following options:");
        System.out.println("1. Register\n2. Login\n3. Edit Profile");
        // store the choice
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                // Registration process
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();
                // display the result
                System.out.println(service.register(email, password) ? "Registration Successful" : "Registration Failed");
            }
            case 2 -> {
                // Login process
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();
                // display the result
                System.out.println(service.login(email, password) ? "Login Successful" : "Invalid Credentials");
            }
            case 3 -> {
                // Edit profile process
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter New Password: ");
                String newPassword = scanner.nextLine();
                // display the result
                System.out.println(service.editProfile(email, newPassword) ? "Profile Updated" : "Update Failed");
            }
            default -> System.out.println("Invalid Choice");
        }
        scanner.close();
    }
}
