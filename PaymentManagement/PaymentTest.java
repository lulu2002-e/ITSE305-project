import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class PaymentTest {

    @Test
    public void testPaymentConstructor() {
        Payment payment = new Payment(1, 123, 100.0, "Credit Card", new Date());
        
        assertEquals(1, payment.getPaymentId());
        assertEquals(123, payment.getPatientId());
        assertEquals(100.0, payment.getAmount(), 0.01);  // Allow for small floating point precision errors
        assertEquals("Credit Card", payment.getPaymentMethod());
        assertNotNull(payment.getPaymentDate());
    }

    @Test
    public void testGetters() {
        Date now = new Date();
        Payment payment = new Payment(1, 123, 200.0, "Cash", now);
        
        assertEquals(1, payment.getPaymentId());
        assertEquals(123, payment.getPatientId());
        assertEquals(200.0, payment.getAmount(), 0.01);
        assertEquals("Cash", payment.getPaymentMethod());
        assertEquals(now, payment.getPaymentDate());
    }
}
