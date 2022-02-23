package ch9Ex9;

import java.util.Scanner;

public class DayOfWeek {

	enum Day {SUN, MON, TUE, WED, THU, FRI, SAT,};


    public static void main(String[] args) {
    	// Calling values() to return all values present inside enum Day and storing them in an array 
        Day array[] = Day.values();
        System.out.println("The Days are: ");
        // Using for loop to print the elements of the array
        for (Day d : array)
        {
          System.out.print(d +" ");
        }
        
        // Prompting the user to enter a day
         System.out.println("\nEnter the day code to find out our hours >> ");

        // Using Scanner class for user input
        Scanner s = new Scanner(System.in);
        String _day = s.nextLine(); // nextLine() reads a string value from the user

        // Using try and catch for exception handling as the user may enter an invalid input
        try {
        // Converting string to enum value using valueOf()
        Day dayEnum = Day.valueOf(_day);
       // Day dayEnum2 = Day.valueOf(_day2);

        // Using switch-case to prevent multiple if-else
        // The switch expression is evaluated once and then the value of the expression is compared with the value of each case
        switch (dayEnum) {
          case SUN:
            System.out.println("On " + dayEnum + " business hours are " + "11-5");
            break;
          case MON:
            System.out.println("On " + dayEnum + " business hours are " + "9-9");
            break;
          case TUE:
            System.out.println("On " + dayEnum + " business hours are " + "9-9");
            break;
          case WED:
            System.out.println("On " + dayEnum + " business hours are " + "9-9");
            break;
          case THU:
            System.out.println("On " + dayEnum + " business hours are " + "9-9");
            break;
          case FRI:
            System.out.println("On " + dayEnum + " business hours are " + "9-9");
            break;
          case SAT:
            System.out.println("On " + dayEnum + " business hours are " + "10-6");
            break;
        }
        
        
      
        }
        catch (Exception e) {
          System.out.println("Please enter a valid day."); // Display a message when user enters an invalid input
        }

  }


}
