package ch4Ex2;

// given code from assignment chapter4 #2
public class Billing {
	
    final static double TAX = 0.08;
    public static void main(String[] args) {
    	
        final double HIGHPRICE = 24.99;
        final double MEDPRICE = 17.50;
        final double LOPRICE = 10.00;
        final int QUAN1 = 4;
        final int QUAN2 = 6;
        double bill;
        
        bill = computeBill(HIGHPRICE);
        System.out.println("The total for a photobook that costs $" +
                           HIGHPRICE + " is $" + bill);
        
        bill = computeBill(MEDPRICE, QUAN1);
        System.out.println("The total for " + QUAN1 +
                           " photobooks that cost $" +
                           MEDPRICE + " is $" + bill);
        
        bill = computeBill(LOPRICE, QUAN2, 20.00);
        System.out.println("The total for " + QUAN2 +
                           " photobooks that cost $" +
                           LOPRICE + " with a $20 coupon is $" + bill);
    }

    public static double computeBill(double amt) {
    	double total = amt * 1.08;
		return total;
    }

    public static double computeBill(double amt, int quantity) {
    	double subtotal = amt * quantity;
	    double total = subtotal * 1.08;
		return total;
	    
        
    }
   public static double computeBill(double amt, int quantity, double coupon) {
	   double subtotal = amt * quantity;
		subtotal = subtotal - coupon;
		
	
	    double total = subtotal * 1.08;
	    
		return total;
		
   }
}

//Orignal code
/*public class Billing {
	final double TAX = .08;
	
public static void main(String[] args) {
		final double HIGHPRICE = 24.99;
		final double MEDPRICE = 17.50;
		final double LOPRICE = 10.00;
		final int QUAN1 = 4;
		final int QUAN2 = 6;
		double yourTotal;
		yourTotal = computeBill(HIGHPRICE);
		displayTotal(yourTotal);
		
		yourTotal = computeBill(10.99, 2);
		displayTotal(yourTotal);
		
		yourTotal = computeBill(10.99, 2, 0.2);
		displayTotal(yourTotal);

	}

	

	private static double computeBill(double price){
		double total = price * 1.08;
		System.out.println("You ordered a photo book and the price is $" + price );
		System.out.println("plus 8% tax ");
		return total;
		
		
	}
	private static double computeBill(double price, int qty) {
	    double subtotal = price * qty;
	    System.out.println("You ordered " + qty + " photo book(s) at a price of $" + price);
	    System.out.println("Your subtotal is $" + subtotal + " plus 8% tax");
	    double total = subtotal * 1.08;
	    
	    
		return total;
		
	}

	private static double computeBill(double price, int qty, double discount) {
		double subtotal = price * qty;
		subtotal = subtotal - (subtotal * discount);
		System.out.println("You ordered " + qty + " photo book(s) at a price of $" + price);
	
	    double total = subtotal * 1.08;
	    System.out.println("Your subtotal less your " + discount * 100 + "% discount is $" + subtotal + " plus 8% tax ");
		return total;
		
		
	}
	private static void displayTotal(double yourTotal) {
		System.out.println("Your total price is $" + yourTotal +"\n");
		
	}


}*/
