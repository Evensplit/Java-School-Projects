package ch7Ex12;

import java.util.Scanner;


public class PrepareTax {
	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter your Social Security Number ");
		  String ssc = input.nextLine();
		  

		  System.out.println("Enter your first name ");
		  String first = input.nextLine();
		  

		  System.out.println("Enter your last name ");
		  String last = input.nextLine();
		  

		  System.out.println("Enter your address ");
		  String address = input.nextLine();
		  

		  System.out.println("Enter your city ");
		  String city = input.nextLine();

		  System.out.println("Enter your state ");
		  String state = input.nextLine();
		  

		  System.out.println("Enter your postal code ");
		  String zip = input.nextLine();
		  
		  System.out.println("Enter your marital status " );
		  String S= input.nextLine();
	       
		  
		  System.out.println("Enter your income");
		  int income = input.nextInt();
		  
	                
		  
		  

		 
	       
		TaxReturn t = new TaxReturn(ssc, first, last, address, city, state, zip, income, 'S');
	       t.display();
	       
	       
	    
	  }
}


