package Java.Work.LabTasks.Week2.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private String patientId;
    private String contactNumber;

    private List<String> medicalHistory;
    private Doctor assignedDoctor;
    private String admissionStatus;

    // Constructor
    public Patient(String name, String patientId, String contactNumber) {
        this.name = name;
        this.patientId = patientId;
        this.contactNumber = contactNumber;
        this.medicalHistory = new ArrayList<>();
        this.admissionStatus = "discharged"; // Default status
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    public Doctor getAssignedDoctor() { 
        return assignedDoctor; 
    }
    public void setAssignedDoctor(Doctor assignedDoctor) { 
        this.assignedDoctor = assignedDoctor; 
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void admitPatient() {
        this.admissionStatus = "admitted";
    }

    public void dischargePatient() {
        this.admissionStatus = "discharged";
    }
}
