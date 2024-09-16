package Java.Work.LabTasks.Week2.Hospital;

public class Equipment {
    private String name;
    private String equipmentID;
    private boolean isAvailable;

    // Constractor
    public Equipment(String n, String id, boolean av){
        this.name = n;
        this.equipmentID = id;
        this.isAvailable = av;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(String id){
        this.equipmentID = id;
    }
    public String getId() {
        return equipmentID;
    }
    public void setAvailable(boolean av){
        this.isAvailable = av;
    }
    public boolean getAvailable() {
        return isAvailable;
    }

    public String getEquipmentDetails() {
        String availability = isAvailable ? "available" : "not available";
        return name + " has an ID " + equipmentID + " and it is " + availability + ".";
    }
}
