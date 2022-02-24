package ch7Ex4;

import java.util.Scanner;

public class ValidatePassword{

public static void main(System[]args) {

		Scanner in = new Scanner(System.in);

        final int NUM_UPPER_LETTERS = 0;
        final int NUM_LOWER_LETTERS = 0;
        int NUM_DIGITS = 0;
		
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		int stringLength;
		String aString;
		int numSpaces = 0;


		System.out.println("Enter your password>> ");
		aString = in.nextLine();
		stringLength = aString.length();
		
		for(int i = 0; i < stringLength; i++) {
			char ch = aString.charAt(i);
			if(Character.isUpperCase(ch)) 
				upperCount++;
				else
					if(Character.isLowerCase(ch)) {
						lowerCount++;
					}
						else
							if(Character.isDigit(ch)) {
								digitCount++;
							
			}
			
			if(upperCount <= NUM_UPPER_LETTERS && lowerCount >= NUM_LOWER_LETTERS
				&& digitCount >= NUM_DIGITS)
               System.out.println("Valid Password");
			
			else {
				System.out.println("The password did not have enough of the following: ");
				if(upperCount < NUM_UPPER_LETTERS)
					System.out.println("upper case letters - at least 2 are required");
				if(lowerCount < NUM_LOWER_LETTERS)
					System.out.println("lower case letters - at least 3 are required");
				
			}
			
		}
	



	

}
}