package Java.Work.LabTasks.Week3.CustomerAccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    // Constructor with balance
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor without balance (default to 0.0)
    public Account(int id, Customer customer) {
        this(id, customer, 0.0);
    }

    // Getter for ID
    public int getID() {
        return id;
    }

    // Getter for Customer
    public Customer getCustomer() {
        return customer;
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Setter for Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Get Customer Name
    public String getCustomerName() {
        return customer.getName();
    }

    // Deposit method
    public Account deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return this;
    }

    // Withdraw method
    public Account withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    // toString method
    public String toString() {
        return getCustomerName() + " (" + getID() + ") balance=$" + String.format("%.2f", balance);
    }
}
