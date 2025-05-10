package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentDL handles data storage and retrieval for payments.
 * It simulates a database using an ArrayList.
 */
public class PaymentDL {
    private List<Payment> paymentDatabase = new ArrayList<>();

    /**
     * Saves a payment record in the system.
     * @param payment The payment to be stored.
     */
    public void savePayment(Payment payment) {
        paymentDatabase.add(payment);
        System.out.println("Payment saved successfully.");
    }

    /**
     * Retrieves all stored payments.
     * @return List of all payment records.
     */
    public List<Payment> getAllPayments() {
        return paymentDatabase;
    }

    /**
     * Finds a payment record by ID.
     * @param paymentId The unique payment ID.
     * @return The Payment object if found, otherwise null.
     */
    public Payment findPaymentById(int paymentId) {
        for (Payment payment : paymentDatabase) {
            if (payment.getPaymentId() == paymentId) {
                return payment;
            }
        }
        return null;
    }
}