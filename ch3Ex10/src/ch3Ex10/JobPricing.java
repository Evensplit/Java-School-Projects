package ch3Ex10;

import java.util.Scanner;

public class JobPricing {

		   public static void main(String[] args)
		   {
		      
		       String jobDescription;
		       double materials;
		       double hoursOnJob;
		       double hoursOnTraveling;
		       double price;
		      
		       Scanner input = new Scanner(System.in);
		       System.out.print("Enter job description >> ");
		       jobDescription = input.nextLine();
		      
		       System.out.print("Enter cost of materials >> ");
		       materials = input.nextDouble();
		      
		       System.out.print("Enter hours on the job work >> ");
		       hoursOnJob = input.nextDouble();
		      
		     
		       System.out.print("Enter hours traveling >> ");
		       hoursOnTraveling = input.nextDouble();
		      
		       price = computePrice(materials, hoursOnJob, hoursOnTraveling);
		      
		       System.out.println("The price for " + jobDescription + " is $" + price);
		   }
		  
		 
		   public static double computePrice(double materials, double hoursOnJob, double hoursOnTraveling)
		   {
		       //variable to store total cost for the job
		       double price;
		      
		       //calculating job cost
		       price = materials + (hoursOnJob * 35) + (hoursOnTraveling * 12);
		      
		       //returns job cost
		       return price;
		   }
		

	}


