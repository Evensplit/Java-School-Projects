package ch5Ex3;

	import java.util.Scanner;
	public class ShadyRestRoom2 {
		
		public static void main (String args[]) {
		int selection;
	      int price;
	      String result;
	      final int QUEEN = 1, KING = 2, SUITE = 3;
	      final int QPRICE = 125, KPRICE = 139,
	         SPRICE = 165;
	      
	      int lakeView = 15;
	      
	      final String QSTRING = "Queen bed", KSTRING = "King bed",
	         SSTRING = "Suite with a king bed and pull-out couch",
	         INVALIDSTRING = "an invalid option";
	      Scanner in = new Scanner(System.in);
	      System.out.println("\t\n\nMenu\n");
	      System.out.println("(" + QUEEN + ") " + QSTRING);
	      System.out.println("(" + KING + ") " + KSTRING);
	      System.out.println("(" + SUITE + ") " + SSTRING);
	      
	      System.out.print("Enter Selection (1, 2, or 3) >> ");
	      selection = in.nextInt();
	      
	      if(selection == QUEEN)
	      {
	         result = QSTRING;
	         price = QPRICE;
	         
	      }
	      else
	         if(selection == KING)
	         {
	            result = KSTRING;
	            price = KPRICE;
	         }
	         else
	            if (selection == SUITE)
	            {
	                result = SSTRING;
	                price = SPRICE;
	            }
	            else
	            {
	                result = INVALIDSTRING;
	                price = 0;
	             }
	     // System.out.println("You selected " + result + "  $" + price);
	      //if result == invalid, we stop the function
	      if( result == INVALIDSTRING){
	        System.out.println(result);
	        return;
	      }
	      //aPrinted the menu for view
	      System.out.println("Please choose a view:");
	      System.out.println("(1) a lake");
	      System.out.println("(2) a park");
	      System.out.print("Enter Selection (1, 2) >> ");

	      //view variable declared
	      int view;
	      view = in.nextInt(); //view taken input
	      String VSTRING; //string to store view

	      
	      //if the view is lake, add LakeView price to original price.
	      if(view==1){
	        VSTRING=" a lake ";
	        price = price + lakeView; //main logic if view is lake
	      }
	      //////////////////////////////////////////////////////////

	      //if the view is park set VSTRING is park
	      else if(view==2){
	        VSTRING=" a park ";
	      }
	      //else put string invalid
	      else{
	        VSTRING=INVALIDSTRING;
	      }
	      //if the VSTRING is invalid, assume it is lake view
	      if(VSTRING == INVALIDSTRING){
	        System.out.println("View value entered is invalid");
	        VSTRING=" a lake "; //set view to lake view.
	        price = price + lakeView; //add the extra price 
	      }

	      //Printed the result.
	      System.out.println("You selected "+result+" with"+VSTRING+"view for $"+price);

	    }
	      
	   }
		
	

	
	   
	//Define the class ShadyRestRoom.

	/*public class ShadyRestRoom2

	{

	     //Start the execution of the main() method.

	     public static void main(String[] args)

	     {

	          //Declare the required variables.

	          int choice, choice_2, room_price = 0;

	          //Display the menu of choices.

	          System.out.println("Enter 1 for a queen bed");

	          System.out.println("Enter 2 for a king bed");

	          System.out.println("Enter 3 for a king and a "

	          + "pullout couch");

	          //Prompt the user to enter a valid choice using

	          //scanner class object.

	          System.out.print("\nEnter the choice: ");

	          Scanner sc = new Scanner(System.in);

	          choice = sc.nextInt();

	          //If the user's choice is b/w 1 and 3.

	          if(choice >=1 && choice <= 3)

	          {

	               //Display menu of choices for view.

	               System.out.println("\nEnter 1 for lake "

	               + "view");

	               System.out.println("Enter 2 for park "

	               + "view");

	              

	               //Prompt the user to select the view.

	               System.out.print("\nEnter choice: ");

	               choice_2 = sc.nextInt();

	              

	               //If user's choice is b/w 1 and 2.

	               if(choice_2 >= 1 && choice_2 <= 2)

	               {

	                     //If choice is 1, then it is a lake

	                     //view add 15 to the room price.

	                     if(choice_2 == 1)

	                     {

	                          room_price = room_price + 15;

	                     }

	               }

	              

	               //Otherwise, display an appropriate message.

	               else

	               {

	                     //Assume the selected room has lake

	                     //view so update room price.

	                     room_price = room_price + 15;

	                     System.out.println("\nInvalid view "

	                     + "choice!");

	               }

	               //Display the user's choice.

	               System.out.print("\nUser choose " + choice

	               + " which is ");

	               //If the user's choice is 1, then display

	               //the price of queen type room.

	               if(choice == 1)

	               {

	                     room_price = room_price + 125;

	                     System.out.print("a queen bed");

	                    

	                     //If it is a lake view, then display

	                     //updated room price.

	                     if(choice_2 == 1)

	                     {

	                          System.out.print(" and user "

	                          + "choose "

	                          + "1 for lake view.");

	                          System.out.println("Price of "

	                          + "queen "

	                          + "bed room with lake view is $"

	                          + room_price);

	                     }

	                     else if(choice_2 == 2)

	                     {

	                          System.out.print(" and user "

	                          + "choose "

	                          + "2 for park view.");

	                          System.out.println("Price of "

	                          + "queen "

	                          + "bed room with park view is $"

	                          + room_price);

	                     }

	                     else

	                     {

	                          System.out.println(".");

	                          System.out.println("Price of "

	                          + "queen "

	                          + "bed room with lake view is $"

	                          + room_price);

	                     }

	               }

	               //If the user's choice is 2, then display

	               //the price of king type room.

	               else if(choice == 2)

	               {

	                     room_price = room_price + 139;

	                     System.out.print("a king bed");

	                    

	                     //If it is a lake view, then display

	                     //updated room price.

	                     if(choice_2 == 1)

	                     {

	                          System.out.println(" and user "

	                          + "choose "

	                          + "1 for lake view.");

	                          System.out.println("Price of "

	                          + "king "

	                          + "bed room with lake view is $"

	                          + room_price);

	                     }

	                     else if(choice_2 == 2)

	                     {

	                          System.out.println(" and user "

	                          + "choose "

	                          + "2 for park view.");

	                          System.out.println("Price of "

	                          + "king "

	                          + "bed room with park view is $"

	                          + room_price);

	                     }

	                     else

	                     {

	                          System.out.println(".");

	                          System.out.println("Price of "

	                          + "king "

	                          + "bed room with lake view is $"

	                          + room_price);

	                     }

	               }

	               //If the user's choice is 3, then display

	               //the price of suite with king type bed

	               //and pullout couch room.

	               else if(choice == 3)

	               {

	                     room_price = room_price + 165;

	                     System.out.print("a suite with king "

	                     + "bed and " + "a pullout couch");

	                    

	                     //If it is a lake view, then display

	                     //updated room price.

	                     if(choice_2 == 1)

	                     {

	                          System.out.println(" and user "

	                          + "choose 1 for lake view.");

	                          System.out.println("Price of "

	                          + "suite with king "

	                          + "bed and pullout couch room "

	                          + "with lake view is $"

	                          + room_price);

	                     }

	                     else if(choice_2 == 2)

	                     {

	                          System.out.println(" and user "

	                          + "choose 2 for park view.");

	                          System.out.println("Price of "

	                          + "suite "

	                          + "with king "

	                          + "bed and pullout couch room "

	                          + "with park view is $"

	                          + room_price);

	                     }

	                     else

	                     {

	                          System.out.println(".");

	                          System.out.println("Price of "

	                          + "suite with king "

	                          + "bed and pullout couch room "

	                          + "with lake view is $"

	                          + room_price);

	                     }

	               }

	          }

	          //Otherwise,

	          else

	          {

	               //Set the price of room to 0 and

	               //display an appropriate message.

	               room_price = 0;

	               System.out.println("It is an "

	               + "invalid choice!");

	          }

	         

	          //Close the scanner object.

	          sc.close();

	     }

}*/
