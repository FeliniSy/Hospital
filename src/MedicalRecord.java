public class MedicalRecord {
    private Patient patient;
    private String diagnosis;

    public MedicalRecord(Patient patient, String diagnosis) {
        this.patient = patient;
        this.diagnosis = diagnosis;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
