package ch5Ex5;
import java.util.*;
import java.time.LocalDate;
public class PastPresentFuture2 {
	
	
	
	public static void main(String args[])
	{
	
	LocalDate today = LocalDate.now();
    LocalDate enteredDate;
	int mo, da, yr;
	int todayMo, todayDa, todayYr;
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter a month >>");
	mo=input.nextInt();
	
	System.out.print("Enter a day >>");
	da=input.nextInt();
	
	System.out.print("Enter a year (four digits) >>");
	yr=input.nextInt();
	//creating a LocalDate object and initializing it to null;
	LocalDate inputDate=null;
	try
	{
	/*we are using the 3 variables and converting it into a date object to compare it with today's date */
	inputDate = LocalDate.of(yr,mo,da);
	  
	}
	catch(Exception ex)
	{
	/*if the entered day,month & year are not converted to a date object because of invalid entry of any values, we are stopping the program.*/
	System.out.println("You have made invalid entries, please try again !!");
	System.exit(0);
	}
	/*if the date object is created after proper entries, we are using the built-in functions to compare it the today's date object*/
	//System.out.print("The date you entered is ");
	if(inputDate.isBefore(today))
	System.out.println(inputDate +" in the past");
	else
	if(inputDate.isAfter(today))
	System.out.println(inputDate +" in the future");
	else
	if(inputDate.equals(today))
	System.out.println(inputDate +" the current date");

	}

}

