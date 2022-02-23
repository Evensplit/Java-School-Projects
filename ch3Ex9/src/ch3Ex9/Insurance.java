package ch3Ex9;

import java.util.Scanner;

public class Insurance {
	


public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int currentYear;
	int birthYear;
	
	System.out.println("Enter current year:>>  ");
	currentYear = input.nextInt();
	
	System.out.println("Enter birth year:>> ");
	birthYear = input.nextInt();
	
	int age = currentYear - birthYear;
	
	int premium = computePremium(currentYear,birthYear);
	System.out.println("At an age of " + age + " Years old you would pay a total return "
			+ "premium of $" + premium);
}
			             



public static int computePremium(int currentYear2, int birthYear2) {
	 
	int years = currentYear2 - birthYear2;
	System.out.println("Age is : " + years);
	int decades = years/10;
	System.out.println("Decade is :" + decades);
	int premium = (decades + 15) * 20;
	return premium;
}


}
