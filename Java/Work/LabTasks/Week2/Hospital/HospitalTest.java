package Java.Work.LabTasks.Week2.Hospital;


public class HospitalTest {
    public static void main(String[] args) {
        // Doctor Patient test
        // Create doctor
        Doctor D1 = new Doctor("Angelina", "2345", "dantist", "1234567890", "available");
        System.out.println(D1.getDoctorDetails());

        // Create three patients
        Patient P1 = new Patient("Mikhail Rondov", "123", "1231234567");
        Patient P2 = new Patient("Raiden Shogun", "134", "5675678765");
        Patient P3 = new Patient("Mika Ember", "146", "0980980987");

        // Add three patients to doctor
        D1.assignPatient(P1);
        D1.assignPatient(P2);
        D1.assignPatient(P3);

        // Print patients and their assigned doctor
        // System.out.println("Patients assigned to " + D1.getName() + ":");
        for (Patient patient : D1.getPatients()) {
            System.out.println(patient.getName() + " is assigned to " + patient.getAssignedDoctor().getName());
        }

        // // Nurse test
        // Nurses S1 = new Nurses("Angelina", "123456", "child care");
        // System.out.println(S1.getNurseDetails());
        // S1.setName("Dilan");
        // System.out.println(S1.getNurseDetails());

        // // Drug test
        // Drugs S1 = new Drugs("Melatonin", "123456", 15);
        // System.out.println(S1.getDrugsDetails());
        // S1.setStock(10);
        // System.out.println(S1.getDrugsDetails());

        // // Equipment test
        // Equipment S1 = new Equipment("Chair", "123456", true);
        // System.out.println(S1.getEquipmentDetails());
        // S1.setAvailable(false);
        // System.out.println(S1.getEquipmentDetails());

        // // Wards test
        // Wards S1 = new Wards("123", 8, 2);
        // System.out.println(S1.getWardsDetails());
        // S1.setAvailableBeds(0);
        // System.out.println(S1.getWardsDetails());

        // // OT test
        // OT S1 = new OT("123", "no date", true);
        // System.out.println(S1.getOTDetails());
        // S1.setAvailable(false);
        // S1.setSchedul("October 8, 2024; 8:30 AM");
        // System.out.println(S1.getOTDetails());
    }
}
