package Java.Work.LabTasks.Week2.Hospital;

public class Nurses {
    private String name;
    private String employeeID;
    private String specialty;

    // Constractor
    public Nurses(String n, String id, String specialty){
        this.name = n;
        this.employeeID = id;
        this.specialty = specialty;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(String id){
        this.employeeID = id;
    }
    public String getId() {
        return employeeID;
    }
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }

    public String getNurseDetails() {
        return name + " is a nurse, employee ID is " + employeeID + " and specializes in " + specialty + ".";
    }
}
