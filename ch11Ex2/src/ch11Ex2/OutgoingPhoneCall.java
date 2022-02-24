package ch11Ex2;

public class OutgoingPhoneCall extends PhoneCall{
	public final static double RATE = .04;
    private int minutes;
    public OutgoingPhoneCall(String num, int mins)
    {
        // write your code here
    	super(num);
    	this.minutes = mins;
    	price = RATE;
        
    }
    public void getInfo()
    {
        // write your code here
    	System.out.println("Phone number: " + getPhoneNumber() + " rate per min is $"+ getPrice()+ " number of minutes is "+ minutes+" total price is "+(minutes * RATE));
    }
    public String getPhoneNumber()
    {
        // write your code here
    	return phoneNumber;
    }
    public double getPrice()
    {
		return price;
        // write your code here
    }

}
