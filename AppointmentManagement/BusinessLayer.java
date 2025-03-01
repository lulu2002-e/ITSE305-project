import java.util.List;

public class BusinessLayer {
    private final Database database;

    public   BusinessLayer(Database database) {
        this.database = database;
    }

    // Book a new appointment
    public void bookAppointment(String doctor, String date, String time, String patient) {
        DataLayer newAppointment = new DataLayer(doctor, date, time, patient);
       
        database.addAppointment(newAppointment);
        System.out.println("Appointment booked successfully!");
    }

    // Reschedule an appointment
    public void rescheduleAppointment(int appointmentId, String newDate, String newTime) {
        DataLayer appointment = database.findAppointmentById(appointmentId);
        if (appointment != null) {

            appointment.reschedule(newDate, newTime);
            System.out.println("Appointment rescheduled successfully!");

        } else {

            System.out.println("Appointment not found.");
        }
    }

    // Cancel an appointment
    public void cancelAppointment(int appointmentId) {
         DataLayer appointment = database.findAppointmentById(appointmentId);
        if (appointment != null) {

            database.removeAppointment(appointmentId);
            System.out.println("Appointment canceled successfully!");

        } else {
            System.out.println("Appointment not found.");
        }
    }

    // List all appointments
    public void listAppointments() {

        List< DataLayer> appointments = database.getAppointments();
        if (appointments.isEmpty())
         {
            System.out.println("No appointments available.");
        } else
         {
            for ( DataLayer a : appointments) {

                System.out.println("ID: " + a.getId() + ", Doctor: " + a.getDoctor() + 
                                   ", Date: " + a.getDate() + ", Time: " + a.getTime() + 
                                   ", Patient: " + a.getPatient());
            }
        }
    }
}
