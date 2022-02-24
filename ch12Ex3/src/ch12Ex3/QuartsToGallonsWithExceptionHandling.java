package ch12Ex3;

import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {
	
	public static void main(String[] args) 
	   {  
	      final int QUARTS_IN_GALLON = 4;
	      int quartsNeeded = 18;
	      int gallonsNeeded;
	      int extraQuartsNeeded;
	      Scanner input = new Scanner(System.in);
	      boolean valid = false;
	      String s;
	      while(!valid) {
	    	  try {
	    		  
	    		 System.out.println("Enter quarts needed >> ");
	    		 s = input.nextLine();
	    		 quartsNeeded= Integer.parseInt(s);
	    		 valid = true;
	    		  
	    	  }
	    	  catch(Exception e){
	    		  System.out.println("Invalid input");
	    		  
	    	  }
	      }
	      
	      
	      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
	      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
	      System.out.println("A job that needs " + quartsNeeded +
	         " quarts requires " + gallonsNeeded + " gallons plus " +
	         extraQuartsNeeded + " quarts.");
	   }

}
