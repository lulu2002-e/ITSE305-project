import org.junit.Test;
import static org.junit.Assert.*;

public class BusinessLayerTest {

    @Test
    public void testBookAppointment() {
        Database database = new Database();
        BusinessLayer business = new BusinessLayer(database);

        business.bookAppointment("Dr. Adams", "2025-08-25", "4:00 PM", "Alice Brown");
        assertEquals(1, database.getAppointments().size());
    }

    @Test
    public void testRescheduleAppointment() {
        Database database = new Database();
        BusinessLayer business = new BusinessLayer(database);
        business.bookAppointment("Dr. Adams", "2025-08-25", "4:00 PM", "Alice Brown");

        int appointmentId = database.getAppointments().get(0).getId();
        business.rescheduleAppointment(appointmentId, "2025-08-30", "5:30 PM");

        DataLayer updated = database.findAppointmentById(appointmentId);
        assertNotNull(updated);
        assertEquals("2025-08-30", updated.getDate());
        assertEquals("5:30 PM", updated.getTime());
    }

    @Test
    public void testCancelAppointment() {
        Database database = new Database();
        BusinessLayer business = new BusinessLayer(database);
        business.bookAppointment("Dr. Adams", "2025-08-25", "4:00 PM", "Alice Brown");

        int appointmentId = database.getAppointments().get(0).getId();
        business.cancelAppointment(appointmentId);

        assertNull(database.findAppointmentById(appointmentId));
    }
}
