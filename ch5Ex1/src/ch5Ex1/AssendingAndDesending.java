package ch5Ex1;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class AssendingAndDesending {


	   public static void ascendingOrder(int num1,int num2,int num3)
	   {
	       if(num1>=num2)
	       {
	           if(num1>=num3)
	           {
	               if(num3>=num2)
	                   System.out.println(num2+" "+num3+" "+num1);
	               else
	                   System.out.println(num3+" "+num2+" "+num1);
	           }
	           else
	               System.out.println(num2+" "+num1+" "+num3);
	       }
	       else
	       {
	           if(num2>=num3)
	           {
	               if(num3>=num1)
	                   System.out.println(num1+" "+num3+" "+num2);
	               else
	                   System.out.println(num3+" "+num1+" "+num2);
	           }
	           else
	               System.out.println(num1+" "+num2+" "+num3);
	       }
	   }
	  
	  
	   public static void descendingOrder(int num1,int num2,int num3)
	   {
	       if(num1>=num2)
	       {
	           if(num1>=num3)
	           {
	               if(num3>=num2)
	                   System.out.println(num1+" "+num3+" "+num2);
	               else
	                   System.out.println(num1+" "+num2+" "+num3);
	           }
	           else
	               System.out.println(num3+" "+num1+" "+num2);
	       }
	       else
	       {
	           if(num2>=num3)
	           {
	               if(num3>=num1)
	                   System.out.println(num2+" "+num3+" "+num1);
	               else
	                   System.out.println(num2+" "+num1+" "+num3);
	           }
	           else
	               System.out.println(num3+" "+num2+" "+num1);
	       }
	   }
	  
	   public static void main (String[] args) throws java.lang.Exception
	   {
	       // your code goes here
	       Scanner input = new Scanner(System.in);
	       int num1,num2,num3;
	      
	       System.out.print("Enter integer: ");
	       num1 = input.nextInt();
	      
	       System.out.print("And another : ");
	       num2 = input.nextInt();
	      
	       System.out.print("Just one more : ");
	       num3 = input.nextInt();
	      
	       System.out.print("Ascending: ");
	       ascendingOrder(num1,num2,num3);
	       System.out.print("Descending: ");
	       descendingOrder(num1,num2,num3);
	  
	   }
	}
	/* public static void main(String[] args) {
		 
		       
	
		 
		 
		
		 int x,y,z;
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter x: ");
		 x = scanner.nextInt();
		 
		 System.out.println("Enter y: ");
		 y = scanner.nextInt();
		 
		 
		 System.out.println("Enter z: ");
		 z= scanner.nextInt();
		 
		 //Checking to see if x is the smallest
		 //to print ascending to descending order
		 
		 if(x<=y && x<=z) {
			//System.out.println("Ascending order: " + x +" "+ " " + y  + " " + " " + z);
			//System.out.println("Descending order: " + z +" "+ " " + y + " " + " " + x);
		 
			 if (y<=z) {
				
				 System.out.println("Ascending: " + x +" "+ " " + y + " " + " " + z);
				 System.out.println("Descending: " + z+" "+ " " + y + " " + " " + x);
			 
			 }
			 else {
				 System.out.println("Ascending: " + x +" "+ " " + z + " " + " " + y);
				 System.out.println("Descending: " + y+" "+ " " + z + " " + " " + x);
			 }
		 }
		 
			 else if(y<=x && y<=z) {
			
			       if (x<=y) {
		           System.out.println("Ascending order: " + y+" "+ " " + x + " " + " " + z);
		           System.out.println("Descending order: " + z +" "+ " " + x + " " + " " + y);
			}
			 
		      else {
			   System.out.println("Ascending order: " + y +" "+ " " + z + " " + " " + x);
		        System.out.println("Descending order: " + x +" "+ " " + z + " " + " " + y);
		     
		 }
	 
			 }   
			 else {
			     if(x<=y) {
				     System.out.println("Ascending order: " + y +" "+ " " + z + " " + " " + x);
				     System.out.println("Descending order: " + x +" "+ " " + z + " " + " " + y);
			 }
			     
			     else {
			    	 System.out.println("Ascending order: " + z +" "+ " " + y+ " " + " " + x);
				     System.out.println("Descending order: " + x+" "+ " " + y + " " + " " + z);
			     }
			     
			     
		 }
		 
			 
		
		 
	        
 

}
}*/