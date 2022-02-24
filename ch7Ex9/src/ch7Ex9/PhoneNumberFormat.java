package ch7Ex9;

import java.util.Scanner;

public class PhoneNumberFormat {
	  public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       String str = "";
	       String formatted = "";
	       float phnumber = 0;
	       do {
	           System.out.println("Enter 10 digit phone number( 999 to exit): ");
	           str = scan.next();
	           //calculate no of digits
	           try {
	               phnumber = Float.parseFloat(str);
	               if(str.length() == 10) {
	                   formatted = "(" + str.substring(0, 3) + ") " + str.substring(3,6) + "-" + str.substring(6);
	                   System.out.println("Formatted phone number: " + formatted);
	               } else if(phnumber != 999) {
	                   System.out.println("Phone number must be 10 digits");
	               }
	           } catch (NumberFormatException e) {
	               System.out.println("Invalid input");
	           }
	          
	          
	       } while(phnumber != 999);
	   }
}
