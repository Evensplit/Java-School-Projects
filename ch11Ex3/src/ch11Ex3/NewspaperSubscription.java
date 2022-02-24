package ch11Ex3;

public abstract class NewspaperSubscription {
	

	 protected String name;
	    protected String address;
	    protected double rate;
	    public String getName()
	    {
	        // write your code here
	    	return name;
	    }
	    public void setName(String n)
	    {
	        // write your code here
	    	this.name = n;
	    }
	    public String getAddress()
	    {
	        // write your code here
	    	return address;
	    }
	    public double getRate()
	    {
	        // write your code here
	    	return rate;
	    }
	    public abstract void setAddress(String s);
	    
	    //abstract method setAddres implemented in child
	}


