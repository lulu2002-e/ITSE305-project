import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class DataLayerTest {

    private DataLayer dataLayer;
    private Payment payment;

    @Before
    public void setUp() {
        // Create a new instance of DataLayer for each test
        dataLayer = new DataLayer();

        // Create a new Payment instance to be used in the tests
        payment = new Payment(1, 123, 100.0, "Credit Card", new java.util.Date());
    }

    @Test
    public void testSavePayment() {
        // Save the payment
        dataLayer.savePayment(payment);
        
        // Retrieve all payments
        List<Payment> payments = dataLayer.getAllPayments();
        
        // Check that the size of the payments list is now 1
        assertEquals(1, payments.size());
        
        // Check that the saved payment is the same as the one we added
        Payment savedPayment = payments.get(0);
        assertEquals(payment.getPaymentId(), savedPayment.getPaymentId());
        assertEquals(payment.getPatientId(), savedPayment.getPatientId());
        assertEquals(payment.getAmount(), savedPayment.getAmount(), 0.01);
        assertEquals(payment.getPaymentMethod(), savedPayment.getPaymentMethod());
    }

    @Test
    public void testFindPaymentById() {
        // Save the payment
        dataLayer.savePayment(payment);
        
        // Find the payment by its ID
        Payment foundPayment = dataLayer.findPaymentById(1);
        
        // Ensure that the payment is found
        assertNotNull(foundPayment);
        assertEquals(payment.getPaymentId(), foundPayment.getPaymentId());
        assertEquals(payment.getPatientId(), foundPayment.getPatientId());
        assertEquals(payment.getAmount(), foundPayment.getAmount(), 0.01);
        assertEquals(payment.getPaymentMethod(), foundPayment.getPaymentMethod());
    }

    @Test
    public void testFindPaymentByIdNotFound() {
        // Try to find a payment that doesn't exist
        Payment foundPayment = dataLayer.findPaymentById(999);
        
        // Assert that no payment is found (should return null)
        assertNull(foundPayment);
    }

    @Test
    public void testGetAllPayments() {
        // Initially, there should be no payments saved
        List<Payment> paymentsBefore = dataLayer.getAllPayments();
        assertEquals(0, paymentsBefore.size());
        
        // Save a payment
        dataLayer.savePayment(payment);
        
        // Now, there should be one payment
        List<Payment> paymentsAfter = dataLayer.getAllPayments();
        assertEquals(1, paymentsAfter.size());
    }
}
