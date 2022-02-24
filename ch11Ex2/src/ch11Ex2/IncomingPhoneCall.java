package ch11Ex2;

public class IncomingPhoneCall extends PhoneCall {
   int time;
    public final static double RATE = .02;
    public IncomingPhoneCall(String num)
    
    {
        // write your code here
    	super(num);
    	price = .02;
    }
    public void getInfo()
    {
        // write your code here
    	//System.out.println("Phone number: " + getPhoneNumber() + " rate per min is $"+getPrice()+" number of minutes is " + time+" total price is "+(time*price));
    	 System.out.println("Phone Number: "+ getPhoneNumber() + " at rate per min is $ " + getPrice() + " is total price of $" + getPrice());  
    }
    public String getPhoneNumber()
    {
        // write your code here
    	return phoneNumber;    }
    
    public double getPrice()
    {
        // write your code here
    return price;
    }

}
