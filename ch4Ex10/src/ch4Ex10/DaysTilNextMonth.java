package ch4Ex10;

import java.time.LocalDate;

public class DaysTilNextMonth {
	public static void main(String[]args) {
		
		
		//Create the present date using the now() function

	    //of the LocalDate class class.

	    LocalDate localDate = LocalDate.now();

	  

	    //Calculate the next month's integer representation

	    //by adding 1 to the returned value of the function

	    //getMonthValue() called over the object localDate.

	    int nextMonthInNum = (localDate.getMonthValue() + 1)

	    % 12;

	    //Create the date of next month using same year,

	    //same day by calling the getYear() and

	    //getDayOfMonth() functions and the value of

	    //nextMonthInNum.

	    LocalDate nextMonthDate = LocalDate.of

	    (localDate.getYear(), nextMonthInNum,

	   localDate.getDayOfMonth());

	    //Get the number of days of the present month.

	    int numberOfDaysInThisMonth =

	    localDate.lengthOfMonth();

	    //Get the number of days passed in this month i.e.

	    //present day.

	    int numberOfDaysPassedThisMonth =

	    localDate.getDayOfMonth();

	   

	    //Calculate the remaining days of the month by

	    //subtracting the number of days passed from

	    //the number of days in this month.

	    int remainingDays = numberOfDaysInThisMonth -

	    numberOfDaysPassedThisMonth;

	    //Display the number of days left to start the

	    //next month.

	    System.out.println("There are " + remainingDays

	    + " days until " + nextMonthDate.getMonth()

	    + " starts.");

	}
		
		
		
	}
	
	/*
	 * create an instance of LocalDate
	 */
	//LocalDate currentDate = LocalDate.now();
	
	//Call getDayOfMonth that returns the day of month
	//int dayOfMonth = currentDate.getDayOfMonth();
	
	/*Call lenghtOfMonth that returns number of 
	 * days in current month 
	 */
  //  int daysInMonth = currentDate.lengthOfMonth();
    
    //calculate the number of days left for
    //next month
    
/*int leftDays = daysInMonth - dayOfMonth;
int nextMonthInNum = (currentDate.getMonthValue() + 1)

% 12;
//System.out.println("Current Date " + currentDate);
//System.out.println("Days left to next month " + leftDays);

/*add numbers leftdays plus 1 to get to next month. 
 * save the object in nextMonth localDate object
 */
	//LocalDate nextMonth = currentDate.plusDays(leftDays + 1);
	//int leftDays1 = leftDays + 1;
	
	//call getMonth that returns month
	//value of next month
	/*System.out.println("Name of next month " + nextMonth.getMonth());
	System.out.println("There are " + nextMonthInNum+ " days left  until " + nextMonth.getMonth() + " starts");
	}
	
	

}*/
