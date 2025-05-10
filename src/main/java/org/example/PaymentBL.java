package org.example;
import java.util.Date;

/**
 * PaymentBL contains the logic for processing payments.
 */
public class PaymentBL {
    private PaymentDL dataLayer;

    public PaymentBL() {
        this.dataLayer = new PaymentDL();
    }

    /**
     * Processes a payment transaction.
     * @param patientId The ID of the patient making the payment.
     * @param amount The amount to be paid.
     * @param method The method of payment (Cash, Credit Card, etc.).
     * @return The Payment object if successful, otherwise null.
     * TODO: Add simple validation for payment method (check if null or empty)
     */
    public Payment processPayment(int patientId, double amount, String method) {
        if (amount <= 0) {
            System.out.println("Error: Payment amount must be greater than zero.");
            return null;
        }
        
        // TODO: Add check if method is null or empty

        Payment newPayment = new Payment(generatePaymentId(), patientId, amount, method, new Date());
        dataLayer.savePayment(newPayment);
        return newPayment;
    }

    /**
     * Generates a unique payment ID (simulated using the current time).
     * @return A unique payment ID.
     */
    private int generatePaymentId() {
        // TODO: Add a random number to make more unique
        return (int) (System.currentTimeMillis() % 100000);
    }
}
