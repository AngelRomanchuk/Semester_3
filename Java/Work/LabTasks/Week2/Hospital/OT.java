package Java.Work.LabTasks.Week2.Hospital;

public class OT {
    private String theaterID;
    private String schedul;
    private boolean isAvailable;

    // Constractor
    public OT(String id, String schedul, boolean av){
        this.theaterID = id;
        this.schedul = schedul;
        this.isAvailable = av;
    }

    public void setId(String id){
        this.theaterID = id;
    }
    public String getId() {
        return theaterID;
    }
    public void setSchedul(String schedul){
        this.schedul = schedul;
    }
    public String getSchedul() {
        return schedul;
    }
    public void setAvailable(boolean av){
        this.isAvailable = av;
    }
    public boolean getAvailable() {
        return isAvailable;
    }

    public String getOTDetails() {
        String availability = isAvailable ? "available" : "not available";
        return "Room " + theaterID + " is " + availability + " ,and is scheduled for " + schedul + ".";
    }
}
