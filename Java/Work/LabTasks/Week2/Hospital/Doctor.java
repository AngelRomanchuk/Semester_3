package Java.Work.LabTasks.Week2.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String employeeId;
    private String specialty;
    private String contactNumber;
    private String availability;
    private List<Patient> patients;

    // Constructor
    public Doctor(String name, String employeeId, String specialty, String contactNumber, String availability) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialty = specialty;
        this.contactNumber = contactNumber;
        this.availability = availability;
        this.patients = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDoctorDetails() {
        return name + " is a " + specialty + " specialist. Contact: " + contactNumber;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void assignPatient(Patient patient) {
        patients.add(patient);
        patient.setAssignedDoctor(this);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public void updateAvailability(String availability) {
        this.availability = availability;
    }
}
