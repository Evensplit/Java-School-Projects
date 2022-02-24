package ch10Ex7;

public class Pizza
{
//declare instance variables
private String description;
private double price;
//constructor
public Pizza(String description,double price)
{
    this.description = description;
    this.price = price;
}
//display the pizza details
public void display()

{

System.out.println(description + " pizza   Price: $" + price);

}


}