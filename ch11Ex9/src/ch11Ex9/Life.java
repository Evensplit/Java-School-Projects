package ch11Ex9;

public class Life extends Insurance{
	 public Life()
	    {
	        // write your code here
		 super("Life");
	    }
	    public void setCost()
	    {
	        // write your code here
	    	cost= 36;
	    }
	    public void display()
	    {
	        // write your code here
	    	System.out.println( getType() + " Insurance costs $" + getCost() + " per month");
	    }
}
