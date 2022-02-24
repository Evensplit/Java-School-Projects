package ch8Ex3;

import java.util.Scanner;

public class CarCareChoice {

	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
	      boolean isMatch = false;
	      String[] items =  { "oil change", "tire rotation",
	         "battery check", "brake inspection"};
	      
	      int[] prices = {25, 22, 15, 5};
	      int x;
	      int matchIndex = 0;
	      
	      String menu = "Enter selection:";
	      
	      for(x = 0; x < items.length; ++x)
	        menu += "\n   " + items[x];
	      System.out.println(menu);
	      
	      String selection = input.nextLine();
	      
	     //question B adding three first letter of selection gives us the selection instead of whole word
	      for (x = 0; x < items.length; x++)
	    	  if(selection.contains(items[x].substring(0,3))) {
					
		    	 
						isMatch = true;
						matchIndex = x;
		      }
	    	  else if(selection.equals(items[x] ))
	      {
		  isMatch = true;
		  matchIndex = x;
	      }
	      if(isMatch) {
	          System.out.println(selection + " price is $" + prices[matchIndex]);
	        	  
	          }
	     
	          
	      else
	          System.out.println("Invalid Entry");
	  }
	}

	
		/*Scanner keyboard = new Scanner(System.in);
		boolean found = false;
		char ch;
		//Array created to store strings of service types
		
		String services[] = {"oil change", "tire rotation", "battery check", "break inspection"};
		//cost of service
		int[] price = {25, 22, 15, 5};
		System.out.println("List of services ");
		
		//print services using a for loop
		for(int i = 0; i < services.length; i++) {
			System.out.println(services[i]);
		}
		
		System.out.println("\nEnter type of service type ");
		String serviceType = keyboard.nextLine();
		
		
		
		
		//read first three letters of service type
		for(int i = 0; i < price.length && !found; i++) {
			
	      //check if  the string matches first three characters entered
			if(serviceType.contains(services[i].substring(0,3))) {
				System.out.println(services[i] + " price: $" + price[i]);
				
				found = true;
			}
			
		}
		
		// if not found then print error dispay message
		if(!found) {
			System.out.println("Invalid service type");
		}
		

	}

}*/
