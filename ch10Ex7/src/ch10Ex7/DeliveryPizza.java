package ch10Ex7;

public class DeliveryPizza extends Pizza
{
private double deliveryFee;
private String address;
public DeliveryPizza(String description, double price, String address)
{
    super(description,price);//calls super class constructor
    if(price>15)
    deliveryFee = 3;
    else
    deliveryFee = 5;
    this.address = address;
}
    public void display(){
    	//call method for super class pizza
    	super.display();
    	System.out.print("        Deliver to: " + address + deliveryFee);
    	
    }

}

