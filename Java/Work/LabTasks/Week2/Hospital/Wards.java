package Java.Work.LabTasks.Week2.Hospital;

public class Wards {
    private String wardID;
    private int capacity;
    private int availableBeds;

    // Constractor
    public Wards(String id, int c, int avbeds){
        this.wardID = id;
        this.capacity = c;
        this.availableBeds = avbeds;
    }

    public void setId(String id){
        this.wardID = id;
    }
    public String getId() {
        return wardID;
    }
    public void setCapacity(int c){
        this.capacity = c;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setAvailableBeds(int avbeds){
        this.availableBeds = avbeds;
    }
    public int getAvailableBeds() {
        return availableBeds;
    }

    public String getWardsDetails() {
        return "Room " + wardID + " has " + availableBeds + " empty beds from " + capacity;
    }
}
