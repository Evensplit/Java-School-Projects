package ch5Ex3;

import java.util.Scanner;

public class ShadyRestRoom {
	 //Start the execution of the main() method.

    public static void main(String[] args)

    {

         //Declare the required variables.

         int choice, room_price = 0;

        

         //Display the menu of choices.
         System.out.println("Menu\n");
         System.out.println("(1) Queen bed");

         System.out.println("(2) King bed");

         System.out.println("(3) Suite with a pull-out couch "

         + "pullout couch");

        

         //Prompt the user to enter a valid choice using

         //scanner class object.

         System.out.print("Enter the selection (1, 2, or 3) >>");

         Scanner sc = new Scanner(System.in);

         choice = sc.nextInt();

        

         //Display the user's choice.

         System.out.print("\nUser choose " + choice + " "

         + "which is ");

        

         //If the user's choice is 1, then display the

         //price of queen type room.

         if(choice == 1)

         {

              room_price = 125;

              System.out.println("a queen bed.");

              System.out.println("Price of queen bed "

              + "room is $" + room_price);

         }

        

         //If the user's choice is 2, then display the

         //price of king type room.

         else if(choice == 2)

         {

              room_price = 139;

              System.out.println("a king bed.");

              System.out.println("Price of king bed "

              + "room is $" + room_price);

         }

        

         //If the user's choice is 3, then display the

         //price of suite with king type bed and pullout

         //couch room.

         else if(choice == 3)

         {

              room_price = 165;

              System.out.println("a suite with king "

              + "bed and " + "a pullout couch.");

              System.out.println("Price of suite with "

              + "king " + "bed and pullout couch room "

              + "is $" + room_price);

         }

        

         //Otherwise,

         else

         {

              //Set the price of room to 0 and display an

              //appropriate message.

              room_price = 0;

              System.out.println("an invalid choice!" + "$" + room_price );

         }

        

         //Close the scanner object.

         sc.close();

    }

}

