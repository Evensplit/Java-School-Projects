package ch11Ex4;

public class DomesticDivision extends Division {
	 protected String state;
	    public DomesticDivision(String title, int acct, String st)
	    {
	        // write your code here
	    	super(title, acct);
	    	this.state = st;
	    }
	    public void display()
	    {
	        // write your code here
	    	System.out.println("Domestic Divsion: " + divisionTitle + ":" + " Acct #" + acctNum + "" + "\nLocated in " + state);
	    }

}
