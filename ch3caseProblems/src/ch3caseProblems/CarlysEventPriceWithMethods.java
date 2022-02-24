package ch3caseProblems;

import java.util.Scanner;

class CarlysEventPriceWithMethods {
	  
	/*public static void main(String[] args) {

	      
	      Event e = new Event();
	      e.setEventNumber(CarlysEventPriceWithMethods.getEventNumber());
	      e.setGuest(CarlysEventPriceWithMethods.getGuests());
	      CarlysEventPriceWithMethods.displayMotto(e);
	}*/
		   
		   private static Scanner sc = new Scanner(System.in);
		  
		   
		   
		   public static String getEventNumber() {
		       System.out.println("Enter event number: ");
		       return sc.next();
		      
		   }
		  
		   public static int getGuests() {
		       System.out.println("Enter no of guests: ");
		       return sc.nextInt();
		   }
	
		   public static void displayMotto(Event e) {

		       System.out.println("**************************");
		       System.out.println("*                        *");
		       System.out.println("*    Carly’s Catering    *");
		       System.out.println("*                        *");
		       System.out.println("**************************");
		       System.out.println("Event ID: " + e.getEventNumber());
		       System.out.println("No. of guests:" + e.getGuests());
		       System.out.println("Price per guest: $" + Event.PRICE_PER_GUEST);
		       computePrice(e);
			   
			   
		       
		   }
		  
		  
		   public static void computePrice(Event e) {
		       System.out.println("Price: $" + e.getPrice());
		       
		       System.out.println("Large event: " + ((e.getGuests() > Event.CUT_OFF) ? "Yes" : "No"));
		   }
		  
		   public static void main(String[] args) {

			   //Create event object
		       Event e = new Event();
		       e.setEventNumber(CarlysEventPriceWithMethods.getEventNumber());
		       e.setGuest(CarlysEventPriceWithMethods.getGuests());
		      
		       //Display company motto
		       CarlysEventPriceWithMethods.displayMotto(e);
		   }

		
		   }
		

		