package HospitalService;

import Doctro.Doctor;
import Patient.Patient;

public class HospitalService {

    public void bookAppointment(Doctor doctor, Patient patient) {
        if (doctor != null && patient != null) {
            System.out.println("Appointment.Appointment booked for patient " + patient.getFullName() +
                    " with Dr. " + doctor.getFullName());
        } else {
            System.out.println("Booking failed. Missing data.");
        }
    }
}
