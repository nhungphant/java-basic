package chapter04;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("MH01", "Converse", 2, -1000);
        Invoice invoice2 = new Invoice("MH02", "Vans", -3, 1999);
        System.out.println(invoice1.getInvoiceAmount());
        System.out.println(invoice2.getInvoiceAmount());
    }
}
