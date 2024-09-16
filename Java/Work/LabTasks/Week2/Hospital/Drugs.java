package Java.Work.LabTasks.Week2.Hospital;

public class Drugs {
    private String name;
    private String drugID;
    private int stock;

    public Drugs(String n, String id, int stock) {
        this.name = n;
        this.drugID = id;
        this.stock = stock;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(String id){
        this.drugID = id;
    }
    public String getId() {
        return drugID;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }

    public String toString() {
        return "Drugs[name="+name+" id="+drugID+" amount in stock="+stock+"]";
    }

    public String getDrugsDetails() {
        return name + " is a drug with ID " + drugID + " and we have " + stock + " in stock.";
    }
}
