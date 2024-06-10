# Hospital_Management_System

The Hospital Management System is a simple Java-based application that helps manage patient appointments and doctor-patient interactions. It demonstrates basic Object-Oriented Programming concepts and provides functionalities for patient management, doctor management, and appointment scheduling.

# Features

Patient Management: Add and maintain patient details.
Doctor Management: Add doctors and view their patients.
Appointment Scheduling: Book and manage appointments for patients with doctors.

# Classes and Responsibilities

Patient.java
Attributes: name, age, appointment
Methods: getName(), getAge(), setAppointment(Appointment), getAppointment()
Doctor.java
Attributes: name, patients (List of patients)
Methods: getName(), addPatient(Patient), getPatients(), viewPatients()
Appointment.java
Attributes: date, time
Methods: getDate(), getTime(), toString()
HospitalManagementSystem.java
Attributes: doctors (Map of doctor names to Doctor objects), patients (Map of patient names to Patient objects)
Methods: addDoctor(String), addPatient(String, int), bookAppointment(String, String, String, String), viewDoctorPatients(String)
Main.java
Entry point of the application containing sample usage of the system.

# Usage
After running the application, you can perform the following actions:

1. Add Doctors and Patients: Use predefined methods to add doctors and patients.
2. Book Appointments: Schedule appointments for patients with specific doctors.
3. View Doctor's Patients: List all patients assigned to a specific doctor.
