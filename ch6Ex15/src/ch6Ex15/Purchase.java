package ch6Ex15;

public class Purchase {
	
	private int invoiceNumber;
    private double saleAmount;
    private double tax;
    private static final double RATE = 0.05;
    
    public void setInvoiceNumber( int num) {
        this.invoiceNumber = num;
    }
    public void setSaleAmount(double amt) {
          
		   this.saleAmount = amt ;
		   this.tax = RATE * this.saleAmount;
    }
    public double getSaleAmount() {
		return saleAmount;
    }
    public int getInvoiceNumber() {
		return invoiceNumber;
    	
    }
    public void display() {
        System.out.println("Invoice #" + invoiceNumber +
                           "  Amount of sale: $" + saleAmount + "  Tax: $" + tax);
    }
}


