import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalManagementSystem {
    private Map<String, Doctor> doctors;
    private Map<String, Patient> patients;

    public HospitalManagementSystem() {
        doctors = new HashMap<>();
        patients = new HashMap<>();
    }

    public void addDoctor(String name) {
        Doctor doctor = new Doctor(name);
        doctors.put(name, doctor);
    }

    public void addPatient(String name, int age) {
        Patient patient = new Patient(name, age);
        patients.put(name, patient);
    }

    public void bookAppointment(String patientName, String doctorName, String date, String time) {
        Patient patient = patients.get(patientName);
        Doctor doctor = doctors.get(doctorName);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        Appointment appointment = new Appointment(date, time);
        patient.setAppointment(appointment);
        doctor.addPatient(patient);

        System.out.println("Appointment booked for " + patientName + " with Dr. " + doctorName + " on " + date + " at " + time);
    }

    public void viewDoctorPatients(String doctorName) {
        Doctor doctor = doctors.get(doctorName);

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        doctor.viewPatients();
    }
}

