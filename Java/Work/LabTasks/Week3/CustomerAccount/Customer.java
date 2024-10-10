package Java.Work.LabTasks.Week3.CustomerAccount;

public class Customer {
    private int ID;
    private String name;
    private char gender; // 'm' for male, 'f' for female

    // Constructor
    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    // Getter for ID
    public int getID() {
        return ID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for gender
    public char getGender() {
        return gender;
    }

    // toString method
    public String toString() {
        return name + "(" + ID + ")";
    }
}

