package org.example;

import java.util.ArrayList;
import java.util.List;

public class Database {
  // make it final
  private final List<AppointmentDL> appointments = new ArrayList<>();

  public Database() {}

  // Add an appointment
  public void addAppointment(AppointmentDL appointment) {
    appointments.add(appointment);
  }

  // Get all appointments
  public List<AppointmentDL> getAppointments() {
    return appointments;
  }

  // Find an appointment by ID
  public AppointmentDL findAppointmentById(int id) {
    for (AppointmentDL a : appointments) {
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
