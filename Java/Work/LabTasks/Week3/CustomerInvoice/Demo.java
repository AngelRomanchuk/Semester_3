package Java.Work.LabTasks.Week3.CustomerInvoice;

public class Demo {
    public static void main(String[] args) {
        // Create some Customer instances
        Customer customer1 = new Customer(1, "Alice", 15); // 15% discount
        Customer customer2 = new Customer(2, "Bob", 10);   // 10% discount

        // Create Invoice instances for each Customer
        Invoice invoice1 = new Invoice(1001, customer1, 200.00); // $200
        Invoice invoice2 = new Invoice(1002, customer2, 150.00); // $150

        // Display information for the first invoice
        System.out.println();
        System.out.println("Invoice ID: " + invoice1.getID());
        System.out.println("Customer Name: " + invoice1.getCustomerName());
        System.out.println("Original Amount: $" + invoice1.getAmount());
        System.out.println("Amount After Discount: $" + invoice1.getAmountAfterDiscount());
        System.out.println("-----------------------------");

        // Display information for the second invoice
        System.out.println("Invoice ID: " + invoice2.getID());
        System.out.println("Customer Name: " + invoice2.getCustomerName());
        System.out.println("Original Amount: $" + invoice2.getAmount());
        System.out.println("Amount After Discount: $" + invoice2.getAmountAfterDiscount());
        System.out.println("-----------------------------");
        
        // Update discount for customer1
        customer1.setDiscount(20); // Update to 20% discount
        System.out.println("Updated Customer Discount for Alice to 20%");
        
        // Display updated invoice information for the first invoice
        System.out.println("Invoice ID: " + invoice1.getID());
        System.out.println("Customer Name: " + invoice1.getCustomerName());
        System.out.println("Original Amount: $" + invoice1.getAmount());
        System.out.println("New Amount After Discount: $" + invoice1.getAmountAfterDiscount());
        System.out.println();
    }
}
