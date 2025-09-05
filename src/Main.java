import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital("Clinical", "Kutaisi");
        Department d = new Department("Cardiology");
        Doctor doc = new Doctor("Ana Arnania",30, "Cardiologist");
        Nurse n = new Nurse("John Doe",25);
        Patient p = new Patient("Bob Brown", 45);
        Room r = new Room(101);

        Appointment a = new Appointment(doc, p, LocalDateTime.now());
        MedicalRecord mr = new MedicalRecord(p, "High blood pressure");
        Treatment t = new Treatment("Heart Surgery");
        Medication m = new Medication("Aspirin", "75mg");

        HospitalService service = new HospitalService();
        service.bookAppointment(doc, p);

        r.assignPatient(p);

        System.out.println("Total hospitals: " + Hospital.getHospitalCount());
    }
}
