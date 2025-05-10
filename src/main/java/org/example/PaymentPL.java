package org.example;
import java.util.Scanner;

/**
 * PaymentPL handles user interaction for payments.
 */
public class PaymentPL {
    public static void main(String[] args) {
        PaymentBL PaymentBL = new PaymentBL();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Clinic Payment System ===");

        // Collect payment details from user
        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();

        System.out.print("Enter Payment Amount: ");
        double amount = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Payment Method (Cash, Credit Card, Insurance): ");
        String method = scanner.nextLine();

        // Process the payment
        Payment payment = PaymentBL.processPayment(patientId, amount, method);

        if (payment != null) {
            System.out.println("Payment successful! Details:");
            System.out.println("Payment ID: " + payment.getPaymentId());
            System.out.println("Patient ID: " + payment.getPatientId());
            System.out.println("Amount Paid: $" + payment.getAmount());
            System.out.println("Payment Method: " + payment.getPaymentMethod());
            System.out.println("Date: " + payment.getPaymentDate());
        } else {
            System.out.println("Payment failed. Please try again.");
        }

        scanner.close();
    }
}