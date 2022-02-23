package ch3case2Problems;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {
	
	    static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args){
	        Rental rental = new Rental();
	        int rentalTime = getRentalTimeInMinutes();
	        String contractNumber = getContractNumber();
	        rental.setContractNumber(contractNumber);
	        rental.setHoursAndMinutes(rentalTime);
	        RentalDemo.displayCompanyMotto();
	        displayRentalDetails(rental);
	        sc.close();
	    }

	    
	     /*Prompts user to enter the contract number
	     * and returns it to the main method
	     * @return
	     */
	    public static String getContractNumber(){
	        System.out.println("Please enter contract number: ");
	        String contractNumber = sc.nextLine().toString();
	        return contractNumber;
	    }

	    /*
	     * Prompts the user to enter the rental time
	     * in minutes and returns the value to main method
	     * @return
	     */
	    public static int getRentalTimeInMinutes(){
	        System.out.println("Please enter the Rental Time in Minutes: ");
	        int rentalTime=0;
	        if(sc.hasNextInt()) {
	            rentalTime = Integer.parseInt(sc.nextLine().toString());
	        }
	        return rentalTime;
	    }

	    /*
	     * Takes as input the Rental object for which the supply is rented
	     * and displays all the rental details, using Rental object
	     * @param rental
	     */
	    public static void displayRentalDetails(Rental rental){
	        System.out.println("Contract Number: "+rental.getContractNumber());
	        System.out.println("Supply Rented For: "+rental.getRentalHours()+" Hours and "+rental.getExtraMinutesOverAnHour()+" minutes");
	        System.out.println("Hourly Rate for Supplies: $"+Rental.HOURLY_RENTAL_RATE+"/Hour");
	        System.out.println("Total Price: $"+rental.getPrice());
	    }

	}
