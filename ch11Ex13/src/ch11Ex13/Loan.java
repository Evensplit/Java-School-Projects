package ch11Ex13;

public abstract class Loan implements  LoanConstants {
	
	    protected int loanNum;
	    protected String lastName;
	    protected double amount;
	    protected double rate;
	    protected int term;
	    public Loan(int num, String name, double amt, int yrs)
	    {
	        // write your code here
	    	 if(amt > MAXLOAN) 
	    		 amt = 100000;
	    		 System.out.println("Loan Amount could not be greater than $100,000");
	    	      // throw new IllegalArgumentException("Loan Amount could not be greater than $100,000");
	    	 
	    	  
	    	   loanNum = num;
	    	   lastName = name;
	    	   amount = amt;
	    	  
	    	   if(yrs == MEDIUM_TERM || yrs == LONG_TERM)
	    	       term = yrs;
	    	   else
	    	       term = SHORT_TERM;
	    }
	    
	    @Override
	    public String toString()
	    {
	        // write your code here
	    	return "Loan #" + loanNum + " Name: " + lastName + " $" + amount + "\n for " + term
	                + " year(s) at " + Math.round(rate*100.0*100.0)/100 +  "% interest";
	    	
	    }

	    public boolean equals(Loan loan)
	    {
	        // write your code here
	    	 if (this == loan)
	             return true;
	         if (loan == null)
	             return false;
	         if (getClass() != loan.getClass())
	             return false;
	         Loan other = (Loan) loan;
	         if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
	             return false;
	         if (lastName == null) {
	             if (other.lastName != null)
	                 return false;
	         } else if (!lastName.equals(other.lastName))
	             return false;
	         if (loanNum != other.loanNum)
	             return false;
	         if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
	             return false;
	         if (term != other.term)
	             return false;
	         return true;
	    }

}
