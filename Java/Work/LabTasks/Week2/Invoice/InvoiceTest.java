package Java.Work.LabTasks.Week2.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("001", "Laptop", 2, 1200.00);
        Invoice invoice2 = new Invoice("002", "Smartphone", 5, 299.99);
        Invoice invoice3 = new Invoice("003", "Headphones", 10, 89.99);
        Invoice invoice4 = new Invoice("004", "Monitor", 1, 450.00);
        
        // Using the copy constructor
        Invoice invoice5 = new Invoice(invoice1); // Copy of invoice1
        
        System.out.println(invoice1);
        System.out.println();
        System.out.println(invoice2);
        System.out.println();
        System.out.println(invoice3);
        System.out.println();
        System.out.println(invoice4);
        System.out.println();
        System.out.println(invoice5);
        System.out.println();
        
        // Print Counter
        System.out.println("Number of invoices created: " + Invoice.getInvoiceCount());
    }
}