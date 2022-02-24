package ch5Ex4;

import java.util.Scanner;

public class CellPhoneService {
	
	public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);//key board inputting thru scanner class
	System.out.println("Enter the Talk minutes");
	int talkmin=sc.nextInt();
	System.out.println("Enter the text mseesage");
	int textmsg= sc.nextInt();
	System.out.println("Enter the Gigabyte Data");
	int gbdata=sc.nextInt();
	
	if(talkmin<500 && textmsg==0 && gbdata==0)
	System.out.println("Plan A 49$ per month");
	
	else if(talkmin<500 && textmsg>0 && gbdata==0)
	{

	System.out.println("Plan B 55$ permonth");
	}
	else if(talkmin>=500 && textmsg<100 && gbdata==0)
	{

	System.out.println("Plan C $61 permonth");
	}
	else if(talkmin>=500 && textmsg>=100 && gbdata==0)
	{

	System.out.println("Plan D $70 per month");
	}
	else if(talkmin==0 && textmsg==0 && gbdata>0 && gbdata<2)
	{

	System.out.println("Plan E $79 per month");
	}
	else if(talkmin==0 && textmsg==0 && gbdata>2)
	{

	System.out.println("Plan E $79 per month");
	}
	
	else if(talkmin >= 500 && textmsg >=100 && gbdata>0 && gbdata<3)
	{

	System.out.println("Plan E $79 per month");
	
	}
	else
	{
	System.out.println("Plan F $87 per month");
	}


	}
}
