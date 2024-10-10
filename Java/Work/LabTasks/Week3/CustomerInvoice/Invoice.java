package Java.Work.LabTasks.Week3.CustomerInvoice;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    // Constructor
    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    // Getter for ID
    public int getID() {
        return ID;
    }

    // Getter and Setter for Customer
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter and Setter for Amount
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Get Customer Name
    public String getCustomerName() {
        return customer.getName();
    }

    // Get Amount After Discount
    public double getAmountAfterDiscount() {
        double discountAmount = (amount * customer.getDiscount()) / 100;
        return amount - discountAmount;
    }
}
