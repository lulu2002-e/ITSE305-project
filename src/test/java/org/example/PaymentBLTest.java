package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentBLTest {

    private PaymentBL PaymentBL;

    @Before
    public void setUp() {
        PaymentBL = new PaymentBL();
    }

    @Test
    public void testProcessPaymentValidAmount() {
        Payment payment = PaymentBL.processPayment(123, 100.0, "Credit Card");
        assertNotNull(payment);  // Payment should not be null
        assertEquals(123, payment.getPatientId());
        assertEquals(100.0, payment.getAmount(), 0.01);
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    @Test
    public void testProcessPaymentInvalidAmount() {
        Payment payment = PaymentBL.processPayment(123, -50.0, "Credit Card");
        assertNull(payment);  // Payment should be null if the amount is invalid
    }

    @Test
    public void testProcessPaymentZeroAmount() {
        Payment payment = PaymentBL.processPayment(123, 0.0, "Credit Card");
        assertNull(payment);  // Payment should be null if the amount is zero
    }
}

