package ch11Ex2;

public abstract class PhoneCall {
	String phoneNumber;
    double price;
    public PhoneCall(String num)
    {
        // write your code here
    	this.phoneNumber = num;
    	this.price = 0.0;
    }
    public void setPrice(double pr)
    {
        // write your code here
    	this.price = pr;
    	
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();

}
