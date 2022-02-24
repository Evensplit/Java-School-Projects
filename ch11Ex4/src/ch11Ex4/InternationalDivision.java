package ch11Ex4;

public class InternationalDivision extends Division{
	
	protected String country;
	protected String language;
    public InternationalDivision(String title, int acct, String cty, String lang)
    {
        // write your code here
    	super(title,acct);
    	country = cty;
    	language = lang;
    	
    }
    public void display()
    {
        // write your code here
    	System.out.println("Domestic Divsion: " + divisionTitle + ":" + " Acct #" + acctNum + "" + "\nLocated in " + country + " language is " + language);
    	
    }

}
