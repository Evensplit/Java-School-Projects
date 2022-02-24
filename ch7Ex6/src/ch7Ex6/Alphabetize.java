package ch7Ex6;

import java.util.Scanner;

public class Alphabetize {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string>> ");
		String str1 = input.nextLine();
		
		System.out.println("Enter a string>> ");
		String str2 = input.nextLine();
		
		System.out.println("Enter a string>> ");
		String str3 = input.nextLine();
		
		if(str1.toLowerCase().compareTo(str2.toLowerCase()) <= 0 &&
				str2.toLowerCase().compareTo(str3.toLowerCase()) <= 0) {
			System.out.println("The strings are in alphbetical order");
		
		}
		else {
			System.out.println("The strings are not in alphbetical order");
		}



	}

}
