package ch11Ex4;

public abstract class Division {
	protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acct)
    {
        // write your code here
    	this.divisionTitle = title;
    	this.acctNum = acct;
    }
    public abstract void display();

}