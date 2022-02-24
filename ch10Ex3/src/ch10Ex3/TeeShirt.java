package ch10Ex3;

public class TeeShirt {

	   private int orderNumber;
	   private String size;
	   private String color;
	   private double price;
	   public void setOrderNumber(int num)
	   {
	       // write your code here
		   this.orderNumber = num;
	   }
	   public void setSize(String sz)
	   {
	       // write your code here
		   this.size = sz;
	   }
	   public void setColor(String color)
	   {
	       // write your code here
		   this.color = color;
	   }
	   public int getOrderNumber()
	   {
	       // write your code here
		   return orderNumber;
	   }
	   public String getSize()
	   {
	       // write your code here
		   return size;
	   }
	   public String getColor()
	   {
	       // write your code here
		   return color;
	   }
	   public double getPrice()
	   {
	       // write your code here
		   if(size.compareTo("XXL") == 0 || size.compareTo("XXXL") == 0) {
			   price=22.99;
		   }
			   else {
			   price=19.99;
			   
			   }
		return price;
		   }
		   
	   }

