package ch4Ex8;

import java.time.*;

public class TestMonthHandling {
	 public static void main(String args[]){
		 
		
		//LocalDate jan31 = LocalDate.of(dec31.getYear(),1,31);
	   // LocalDate dec31 = LocalDate.of(jan31.getYear(),12,31);//LocalDate.of(2021, 12, 31);
	     
	    //LocalDate current = LocalDate.now();
	    //LocalDate jan31 = LocalDate.of(2021,1,31);
	   // LocalDate dec31 = LocalDate.of(2021,12,31);
	    //System.out.println("Date1: "+date1);
	    // LocalDate date2 = LocalDate.of(current.getYear(),1,31);
	    // System.out.println("Date2: "+date2);
	   // LocalDate jan31;
	   // LocalDate dec31;
	    int year =0;
	    LocalDate now = LocalDate.now();
	    year= now.getYear();
	   
	    LocalDate jan31 = LocalDate.of(year, 1, 31);
	    LocalDate dec31= LocalDate.of(year, 12, 31);


	     
	     System.out.println("First date " + jan31);
	        jan31 = jan31.plusMonths(1);
	    // System.out.println("after one month");
	     System.out.println("Second date: " + jan31);
	     
	     jan31 = jan31.plusMonths(1);
	     jan31= jan31.plusDays(3);
	     System.out.println("Third date: " + jan31);
	     jan31 = jan31.plusMonths(1);
	     System.out.println("Fourth date "+ jan31);
	     
	     //date 2Dec 31
	     //dec31 = dec31.plusMonths(11);
	    
	     System.out.println("First date " + dec31);
	        dec31 = dec31.plusMonths(1);
	       // dec31 = dec31.plusDays();
	    // System.out.println("after one month");
	     System.out.println("Second date: " + dec31);
	     
	     dec31 = dec31.plusMonths(1);
	     //dec31= dec31.plusDays(0);
	     System.out.println("Third date: " + dec31);
	     dec31 = dec31.plusMonths(1);
	     dec31= dec31.plusDays(3);
	     System.out.println("Fourth date "+ dec31);
	     
	     
	     
	     
	     
	 }	 
}   /* LocalDate current = LocalDate.now();
	     LocalDate date1=LocalDate.of(current.getYear(),12,31);
	     
	    //System.out.println("Date1: "+date1);
	     LocalDate date2 = LocalDate.of(current.getYear(),1,31);
	     System.out.println("Date2: "+date2);

	    System.out.println("The following are the resulting dates after manipulation on Date1-->");
	        date1=date1.plusMonths(1);
	     System.out.println("First date: " + date1);
	        date1=date1.plusMonths(1);
	     System.out.println("Second date: " + date1);
	        date1=date1.plusMonths(1);
	     System.out.println("Third date: " + date1);
	        date1=date1.plusMonths(1);
	     System.out.println("Fourth date: " + date1);
	     

	     System.out.println("The following are the resulting dates after manipulation on Date2-->");
	        date2=date2.plusMonths(1);
	     System.out.println("first date: " +  date2);
	     
	        date2=date2.plusMonths(1);
	     System.out.println("Second date:" + date2);
	     
	        date2=date2.plusMonths(1);
	     System.out.println("Third date: " + date2);
	        date2=date2.plusMonths(1);
	     System.out.println("Fourth date: " + date2);*/

	    


