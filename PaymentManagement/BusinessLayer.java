import java.util.Date;

/**
 * BusinessLayer contains the logic for processing payments.
 */
public class BusinessLayer {
    private DataLayer dataLayer;

    public BusinessLayer() {
        this.dataLayer = new DataLayer();
    }

    /**
     * Processes a payment transaction.
     * @param patientId The ID of the patient making the payment.
     * @param amount The amount to be paid.
     * @param method The method of payment (Cash, Credit Card, etc.).
     * @return The Payment object if successful, otherwise null.
     */
    public Payment processPayment(int patientId, double amount, String method) {
        if (amount <= 0) {
            System.out.println("Error: Payment amount must be greater than zero.");
            return null;
        }

        Payment newPayment = new Payment(generatePaymentId(), patientId, amount, method, new Date());
        dataLayer.savePayment(newPayment);
        return newPayment;
    }

    /**
     * Generates a unique payment ID (simulated using the current time).
     * @return A unique payment ID.
     */
    private int generatePaymentId() {
        return (int) (System.currentTimeMillis() % 100000);
    }
}