package ch3ex8;

import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println("Enter Room Height ");
double height = input.nextDouble();

System.out.println("Enter Room length ");
double lenght1 = input.nextDouble();

System.out.println("Enter Room another length ");
double lenght2= input.nextDouble();

double cost = calculateArea(height, lenght1, lenght2);
System.out.println("Your total cost at $32/gallon is $" + cost);




	}

	public static double calculateArea(double h, double len1, double len2) {
		
		double wallArea = (len1 * h * 2) + (len2 * h * 2);
		System.out.println("Your room has a wall area of " + wallArea);
		
		double gallonsNeeded = calculateGallons(wallArea);
        System.out.print(gallonsNeeded + " gallaons are needed to paint the room ");
        
	    double totalPrice = gallonsNeeded * 32;
	    return totalPrice;
	}
	
	

	public static double calculateGallons(double wArea) {
		
		double numberOfGallons = wArea /350;
		return numberOfGallons;
	}

}
