package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentDLTest {

    @Test
    public void testAppointmentDLCreation() {
        AppointmentDL appointment = new AppointmentDL("Dr. Smith", "2025-04-10", "10:00 AM", "John Doe");
        assertNotNull(appointment);
        assertEquals("Dr. Smith", appointment.getDoctor());
        assertEquals("2025-04-10", appointment.getDate());
        assertEquals("10:00 AM", appointment.getTime());
        assertEquals("John Doe", appointment.getPatient());
    }

    @Test
    public void testReschedule() {
        AppointmentDL appointment = new AppointmentDL("Dr. Smith", "2025-04-10", "10:00 AM", "John Doe");
        appointment.reschedule("2025-04-12", "2:00 PM");
        assertEquals("2025-04-12", appointment.getDate());
        assertEquals("2:00 PM", appointment.getTime());
    }
}
