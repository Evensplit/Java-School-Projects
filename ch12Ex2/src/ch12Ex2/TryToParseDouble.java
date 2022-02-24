package ch12Ex2;

import java.util.Scanner;

public class TryToParseDouble {
	public static void main(String[] args) {
        // Write your code here
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number to " + "parse to double: ");
		
		try{
			double doubleValue = Double.parseDouble(scanner.nextLine());
			System.out.println("String parsed to " + " double " + doubleValue);
		}
		catch(NumberFormatException e){
			double doubleValue = 0;
			System.out.println(doubleValue);
			System.out.println("Value entered cannot be converted to a floating-point number.");
			System.out.println();
			
		}
    }

}
