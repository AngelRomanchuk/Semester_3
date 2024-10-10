package Java.Work.LabTasks.Week3.CustomerInvoice;

public class Customer {
    private int ID;
    private String name;
    private int discount; // in percent

    // Constructor
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    // Getter for ID
    public int getID() {
        return ID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter and Setter for discount
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString method
    public String toString() {
        return name + "(" + ID + ")";
    }
}
