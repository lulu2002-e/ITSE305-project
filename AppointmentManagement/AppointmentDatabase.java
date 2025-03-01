import java.util.ArrayList;
import java.util.List;

public class AppointmentDatabase {
    //make it final
    private final List<Appointment> appointments= new ArrayList<>();

     public AppointmentDatabase() {
    }

    // Add an appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Get all appointments
    public List<Appointment> getAppointments() {
        return appointments;
    }

    // Find an appointment by ID
    public Appointment findAppointmentById(int id) {
        for (Appointment a : appointments) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    // Remove an appointment by ID
    public void removeAppointment(int id) {
        appointments.removeIf(a -> a.getId() == id);
    }
}
