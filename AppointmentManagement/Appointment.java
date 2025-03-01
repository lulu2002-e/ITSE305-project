public class Appointment {
    private static int counter = 1;
    private int id;
    private String doctor;
    private String date;
    private String time;
    private String patient;
    
    // Default constructor (needed for some cases)
    public Appointment() {}

    // Parameterized constructor
    public Appointment(String doctor, String date, String time, String patient) {
        this.id = counter++;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.patient = patient;
    }

    // Getters
    public int getId() { return id; }
    public String getDoctor() { return doctor; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getPatient() { return patient; }

    // Setter for rescheduling
    public void reschedule(String newDate, String newTime) {
        this.date = newDate;
        this.time = newTime;
    }
}
