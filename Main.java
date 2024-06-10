public class Main {
    public static void main(String[] args) {
        HospitalManagementSystem hms = new HospitalManagementSystem();

        hms.addDoctor("Vikas");
        hms.addDoctor("Amit");

        hms.addPatient("Kajal", 30);
        hms.addPatient("Roshan", 25);

        hms.bookAppointment("Kajal", "Vikas", "2024-06-10", "10:00 AM");
        hms.bookAppointment("Rosham", "Amit", "2024-06-11", "11:00 AM");

        hms.viewDoctorPatients("Vikas");
        hms.viewDoctorPatients("Amit");
    }
}
