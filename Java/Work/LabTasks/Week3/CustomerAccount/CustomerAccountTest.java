package Java.Work.LabTasks.Week3.CustomerAccount;

public class CustomerAccountTest {
    public static void main(String[] args) {
        // Create some Customer instances
        Customer customer1 = new Customer(1, "Alice", 'f'); // Female
        Customer customer2 = new Customer(2, "Bob", 'm');   // Male

        // Create Account instances for each Customer
        Account account1 = new Account(1001, customer1);
        Account account2 = new Account(1002, customer2, 500.00); // Initial balance of $500

        // Display customer information
        System.out.println();
        System.out.println("Customer Information:");
        System.out.println(customer1); // Alice (1)
        System.out.println("Gender: " + customer1.getGender());
        System.out.println(customer2); // Bob (2)
        System.out.println("Gender: " + customer2.getGender());
        System.out.println();

        // Display initial account information
        System.out.println("Account Information:");
        System.out.println(account1); // Alice (1) balance=$0.00
        System.out.println(account2); // Bob (2) balance=$500.00
        System.out.println();

        // Deposit money into Alice's account
        account1.deposit(300.50);
        System.out.println("After depositing $300.50 to Alice's account: " + account1);

        // Withdraw money from Alice's account
        account1.withdraw(100.00);
        System.out.println("After withdrawing $100.00 from Alice's account: " + account1);

        // Attempt to withdraw more than Alice's balance
        account1.withdraw(300.00);
        System.out.println("After attempting to withdraw $300.00 from Alice's account: " + account1);

        // Withdraw money from Bob's account
        account2.withdraw(200.00);
        System.out.println("After withdrawing $200.00 from Bob's account: " + account2);

        // Deposit money into Bob's account
        account2.deposit(150.25);
        System.out.println("After depositing $150.25 to Bob's account: " + account2);
        System.out.println();
    }
}
