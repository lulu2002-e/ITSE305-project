package org.example;
import java.util.Date;

/**
 * Payment represents a payment transaction in the clinic system.
 */
public class Payment {
    private int paymentId;
    private int patientId;
    private double amount;
    private String paymentMethod;
    private Date paymentDate;

    public Payment(int paymentId, int patientId, double amount, String paymentMethod, Date paymentDate) {
        this.paymentId = paymentId;
        this.patientId = patientId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public int getPaymentId() {
        return paymentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}