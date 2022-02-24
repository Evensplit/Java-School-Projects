package ch3Ex13;
import java.util.Scanner;


public class DebugCh3 {
	// chapter 3 debugging exercise 1 corrected
//}
	/*public static void main(String args[])
	   {
	      double myCheck = 50.00;
	      double yourCheck = 19.95;
	      System.out.println("Tips are");
	      calcTip(myCheck);
	      calcTip(yourCheck);
	    }
	    public static void calcTip(double bill)
	    {
	       final double RATE = 0.15;
	       double tip;
	       //double bill;
		//double check= bill;
		tip = bill * RATE;
	       System.out.println("The tip should be at least " + tip);
	    }
}*/
	
	
	//chapter 3 debugging exercise 2 corrected
 /*public static void main(String args[])
{
   int a = 2, b = 5, c = 10;
   add(a, b);
   add(b, c);
   subtract(c, a);      
   
   
}
public static void add(int a,  int b)
{

 
  System.out.println("The sum of " + a +
	      " and " + b + " is " +(a + b));

}

public static void subtract(int a, int b)
{
	
	System.out.println("The difference between "  +
	           a + " and " + b + " is " + (a -b));
	
   
}
	
}*/	
	
	//Debugging exercise 3 corrected
	
/*public static void main(String args[])
	   {
	      String name;
	      name = getName();
	      displayGreeting(name);           
	   }
	  
	public static String getName()
	
	   {
	      String name;
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter name ");
	      name = input.nextLine();
	      return name;
	   }
	   public static void displayGreeting(String name)
	   {
	      System.out.println("Hello, " + name + "!");
		
	   }
}*/
	
	//chapter 3 debugging exercise 4 corrected
	
	public static void main(String args[])
	   {
	      int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition: " );
	      tuitionBill(myCredits, rate);
	      System.out.println("Your tuition: ");
	      tuitionBill(yourCredits, rate);
	   }
	   public static void tuitionBill(int c, double r)
	   {
	      System.out.println("Total due "  + (c * r));
	   }
}
