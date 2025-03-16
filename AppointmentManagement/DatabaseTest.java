import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseTest {

    @Test
    public void testAddAndGetAppointments() {
        Database database = new Database();
        DataLayer appointment = new DataLayer("Dr. Brown", "2025-05-10", "11:00 AM", "Jane Doe");
        database.addAppointment(appointment);

        assertFalse(database.getAppointments().isEmpty());
        assertEquals(1, database.getAppointments().size());
    }

    @Test
    public void testFindAppointmentById() {
        Database database = new Database();
        DataLayer appointment = new DataLayer("Dr. Green", "2025-06-15", "9:30 AM", "Mark Smith");
        database.addAppointment(appointment);

        DataLayer found = database.findAppointmentById(appointment.getId());
        assertNotNull(found);
        assertEquals("Dr. Green", found.getDoctor());
    }

    @Test
    public void testRemoveAppointment() {
        Database database = new Database();
        DataLayer appointment = new DataLayer("Dr. White", "2025-07-20", "3:00 PM", "Emma Johnson");
        database.addAppointment(appointment);

        assertFalse(database.getAppointments().isEmpty());
        database.removeAppointment(appointment.getId());
        assertTrue(database.getAppointments().isEmpty());
    }
}
