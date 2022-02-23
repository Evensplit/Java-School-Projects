package ch3ex8;

import java.util.Scanner;

public class PaintCalculator2 {
	
	//Constants
	private static int AREA_PER_GALLON = 350;
	private static double PRICE_PER_GALLON = 32;
	
	//Method that calculate the area, gallons of required paint and the total price
	public static double calculate(double length, double height, double width) {
	double area = length * height * 2 + width * height * 2;
	double gallonsRequired = calculateGallons(area);
	System.out.println("Require Gallons of paint: " + gallonsRequired);
	double price = gallonsRequired * PRICE_PER_GALLON;
	return price;
	}
	
	
	//Method that returns the number of gallons for the given area
	public static double calculateGallons(double area) {
	return area/AREA_PER_GALLON;
	}
	public static void main(String[] args) {
	int length, width;
	int height;
	
	//Read the length, height and width from the user
	Scanner inputScanner = new Scanner(System.in);
	
	System.out.print("Enter Length of the room: ");
	length = inputScanner.nextInt();
	
	System.out.print("Enter Width of the room: ");
	width = inputScanner.nextInt();
	System.out.print("Enter Height of the room: ");
	height = inputScanner.nextInt();
	//Now, calculate the area, gallons and the price
	double price = calculate(length, height, width);
	//Print the final price
	System.out.println("Price: $" + price);
	inputScanner.close();
	}
	}

    





