package ch11Ex9;

public class Health extends Insurance{
	 public Health()
	    {
	        // write your code here
		 super("Health");
	    }
	    public void setCost()
	    {
	        // write your code here
	    	cost = 196;
	    }
	    public void display()
	    {
	        // write your code here
	    	System.out.println( getType() + " Insurance costs $" + getCost() + " per month");
	       
	    }

}
