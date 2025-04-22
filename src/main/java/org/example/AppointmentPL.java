package org.example;

import java.util.Scanner;

public class AppointmentPL {
  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Database database = new Database();
    AppointmentBL service = new AppointmentBL(database);

    while (true) {
      System.out.println("\n--- Appointment Management System ---");
      System.out.println("1. Book Appointment");
      System.out.println("2. Reschedule Appointment");
      System.out.println("3. Cancel Appointment");
      System.out.println("4. View All Appointments");
      System.out.println("5. Exit");
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          // Booking appointment logic
          System.out.print("Enter Doctor's Name: ");
          String doctor = scanner.nextLine();

          System.out.print("Enter Date (YYYY-MM-DD): ");
          String date = scanner.nextLine();

          System.out.print("Enter Time (HH:MM AM/PM): ");
          String time = scanner.nextLine();

          System.out.print("Enter Patient's Name: ");
          String patient = scanner.nextLine();
          service.bookAppointment(doctor, date, time, patient);
          break;

        case 2:
          // Rescheduling appointment logic
          System.out.print("Enter Appointment ID to Reschedule: ");
          int rescheduleId = scanner.nextInt();
          scanner.nextLine();

          System.out.print("Enter New Date (YYYY-MM-DD): ");
          String newDate = scanner.nextLine();

          System.out.print("Enter New Time (HH:MM AM/PM): ");
          String newTime = scanner.nextLine();

          service.rescheduleAppointment(rescheduleId, newDate, newTime);
          break;

        case 3:
          // Canceling appointment logic
          System.out.print("Enter Appointment ID to Cancel: ");
          int cancelId = scanner.nextInt();
          scanner.nextLine();
          service.cancelAppointment(cancelId);
          break;

        case 4:
          // View all appointments logic
          service.listAppointments();
          break;

        case 5:
          System.out.println("Exiting... Thank you!");
          scanner.close();
          return;

        default:
          System.out.println("Invalid choice! Please try again.");
      }
    }
  }
}
