package Java.Work.LabTasks.Week2.Invoice;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    // Static count
    private static int invoiceCount = 0;
    
    // Constructor
    public Invoice(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }
    
    // Copy constructor
    public Invoice(Invoice other) {
        this.id = other.id;
        this.desc = other.desc;
        this.qty = other.qty;
        this.unitPrice = other.unitPrice;
        invoiceCount++;
    }

    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    // Method to calculate the total amount for the invoice
    public double getTotal() {
        return qty * unitPrice;
    }

    public static int getInvoiceCount() {
        return invoiceCount;
    }

    // toString
    public String toString() {
        return "InvoiceItem[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+"]";
    }
}
