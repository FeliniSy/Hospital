package Appointment;

import Doctro.Doctor;
import Patient.Patient;

import java.time.LocalDateTime;

public class Appointment {

    private Doctor doctor;
    private Patient patient;
    private LocalDateTime time;

    public Appointment(Doctor doctor, Patient patient, LocalDateTime time) {
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
    }


    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
