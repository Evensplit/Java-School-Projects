package ch9Ex11;

import java.util.Scanner;

public class MorgansBonuses {
	
	public static void main(String[] args)

	{
		//Table/multi dimensional  array
	double[][] arr={{5,9,16,22,30},{10,12,18,24,36},{20,25,32,42,53},{32,38,45,55,68},{46,54,65,77,90},{60,72,84,96,120},{85,100,120,140,175}};
	//new object of Scanner
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number of full weeks worked or 99 to quit>> ");//prompts user to enter # of weeks
	
	int num = scanner.nextInt();//user data entered is set to num variable
	
	while(num!=99)
	{
	  
	System.out.println("Enter the number of positive reviews>> ");
	int reviews = scanner.nextInt();
	if(num >= 6)
	num = 6;
	if(reviews >= 4)
	reviews = 4;
	System.out.println("Bonus for " + num + " weeks and " + reviews + " positive reviews is " + arr [num][( reviews)]);
	System.out.println("Enter number of full weeks worked or 99 to quit>> ");
	num = scanner.nextInt();
	}


	}

}
