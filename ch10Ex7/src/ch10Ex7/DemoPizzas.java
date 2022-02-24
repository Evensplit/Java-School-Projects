package ch10Ex7;

public class DemoPizzas
{
public static void main(String[] args)
{
	Pizza pizza = new Pizza("sausage and onion", 14.99);
	//pizza.display();
     DeliveryPizza deliveryPizza = new DeliveryPizza("sausage and onion",14.99,"22 Acorn Street, APT 882.");
     deliveryPizza.display();//display pizza details
}
}
