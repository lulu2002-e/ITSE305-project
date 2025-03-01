import java.util.ArrayList;
import java.util.List;

public class Database {
    //make it final
    private final List<DataLayer> appointments= new ArrayList<>();

     public Database() {
    }

    // Add an appointment
    public void addAppointment(DataLayer appointment) {
        appointments.add(appointment);
    }

    // Get all appointments
    public List< DataLayer> getAppointments() {
        return appointments;
    }

    // Find an appointment by ID
    public  DataLayer findAppointmentById(int id) {
        for ( DataLayer a : appointments) {
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
