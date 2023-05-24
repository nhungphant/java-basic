package chapter04;

public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double unitPrice;

    public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
        if (unitPrice < 0) {
            this.unitPrice = 0.0;
        } else {
            this.unitPrice = unitPrice;
        }
    }

    public double getInvoiceAmount() {
        double invoiceAmount = quantity * unitPrice;
        return invoiceAmount;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        if (quantity < 0) {
            return 0;
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        if (unitPrice < 0) {
            return 0.0;
        }
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
