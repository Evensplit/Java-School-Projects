package ch11Ex9;

public abstract class Insurance {
	
	 protected String type;
	    protected double cost;
	    public Insurance(String lh)
	    {
	        // write your code here
	    	this.type = lh;
	    }
	    public String getType()
	    {
	        // write your code here
	    	return type;
	    }
	    public double getCost()
	    {
	        // write your code here
	    	return cost;
	    }
	    public abstract void setCost();
	    public abstract void display();

}
