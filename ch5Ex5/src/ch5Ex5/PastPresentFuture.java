package ch5Ex5;

import java.util.Calendar;
import java.util.Scanner;

public class PastPresentFuture {
	public static void main(String[] args) {
		
		
		
	
		//Get an instance of the calendar class
		Calendar now = Calendar.getInstance();
		
		//get this year value
		int thisYear = now.get(Calendar.YEAR);
		
		//get month value
		int thisMonth = now.get(Calendar.MONTH) + 1;
		
		//since month starts from 0, add one
		//get day of this month
		int thisDay = now.get(Calendar.DAY_OF_MONTH);
		
		//declare variables to read year, month, and day
		int year, month, day;
		
		//Create an instance of the Scanner class
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter month: ");
		month = scanner.nextInt();
		
		System.out.println("Enter day: ");
		day = scanner.nextInt();
		
		System.out.println("Enter year: ");
		year = scanner.nextInt();
		
		
		
		
		//System.out.println("User Input Date: ");
		//System.out.println("MM/DD/YYYY: " + month + "/" + day +
		//		"/" + year);
		
		//checking if the year is less than this year
		if(year < thisYear || year > thisYear) {
			System.out.println(year + " is not this year");
		}
			//checking if year is equal to this year
		else if (year == thisYear) {
			//check if month is less than this month
			if (month < thisMonth) {
				System.out.println(month + " is month earlier this year");
			}
			//check if month is greater than this month
		     else if(month > thisMonth) {
					System.out.println(month +" is a month later this year");
				}
			
		     else
		    	 //otherwise month is equal to this month
		    	 System.out.println("This month");
			}
				
			
		}
		
	}


	
