package ch5Ex6;

import java.util.Scanner;

public class AcmePay {
	  //main method
	   public static void main(String[] args)
	   {
	       //Create object for Scanner class
	       Scanner sc = new Scanner(System.in);
	      
	       //declare shift and retirement
	       int shift = 0, retirement = 0;
	       // store shift rates in the variables
	       double pay_shift1 = 17, pay_shift2 = 18.50, pay_shift3 = 22;

	       //Declare and initialize variables
	       //to store user input
	       double hoursWorked = 0,regularPay =0,overtimePay =0,
	               netPay=0,grossPay =0,deduction =0;
	       

	       //prompt and read the shift value
	       System.out.print("Pleas enter shift - 1, 2, 3 ");
	       shift = sc.nextInt();
	      
	       // prompt and read number of hours
	       System.out.print("Please enter hours worked ");
	       hoursWorked = sc.nextDouble();


	       // Calculate and print the desired results
	       if(shift==1)
	       {
	           // Print hours worked
	          
	           System.out.println("Hours worked is " + hoursWorked);
	           System.out.println("Hourly pay rate is $" + pay_shift1);

	           //if works less than 40
	           if(hoursWorked <= 40)
	           {
	               regularPay = hoursWorked * pay_shift1;
	               overtimePay = 0;
	               grossPay = regularPay;
	               netPay = grossPay;
	               
	           }
	           //if works greater than 40
	           //compute the pay
	           else
	           {
	               regularPay = 40 * pay_shift1;
	               overtimePay = (hoursWorked-40) * (1.5 * pay_shift1);
	               grossPay = regularPay+overtimePay;
	               netPay = grossPay;
	           }
	       }
	       //if shift is 2
	       else if(shift==2)
	       {
	           //prompt whether optied for retirement or not
	           System.out.print("Do you want to participate in the retirement:\n"
	                   + "(Enter 1 for yes and 2 for no):");
	           retirement = sc.nextInt();

	           // Print hours worked
	         
	           System.out.println("Hours worked is " + hoursWorked);
	           System.out.println("Hourly pay rate is " + pay_shift2);
	           //if input hours less than 40
	           if(hoursWorked <= 40)
	           {
	               regularPay = hoursWorked * pay_shift2;
	               
	               //regularPay = 40 * pay_shift1;
	               overtimePay = 0;
	               grossPay = regularPay;
	               netPay = grossPay;
	               
	               if(retirement==1)
	               {
	                   deduction = 0.03 * grossPay;
	                   netPay = grossPay - deduction;
	               }
	           }
	           else
	           {
	               regularPay = 40 * pay_shift2;
	               overtimePay = (hoursWorked - 40) * (1.5 * pay_shift2);
	               grossPay = regularPay+overtimePay;
	               
	               if(retirement == 1)
	               {
	                   deduction = 0.03 * grossPay;
	                   netPay = grossPay - deduction;
	               }
	           }
	       }
	       //if shift is 3
	       else if(shift ==3 )
	       {
	    	   System.out.print("Do you want to participate in the retirement:\n"
	                   + "(Enter 1 for yes and 2 for no):");
	           retirement = sc.nextInt();

	           //print the output values
	           System.out.println("Hours worked is " + hoursWorked);
	           System.out.println("Hourly pay rate is " + pay_shift3);
	           //if input hours less than 40
	           if(hoursWorked <= 40)
	           {
	               regularPay = hoursWorked * pay_shift3;
	               overtimePay = 0;
	               grossPay = regularPay;
	               netPay = grossPay;
	               
	               if(retirement == 1)
	               {
	                   deduction = 0.03 * grossPay;
	                   netPay = grossPay - deduction;
	               }
	           }
	           else
	           {
	               regularPay = 40 * pay_shift3;
	               overtimePay = (hoursWorked - 40) * (1.5 * pay_shift3);
	               grossPay = regularPay + overtimePay;
	               netPay = grossPay;
	               if(retirement == 1)
	               {
	                   deduction = 0.03 * grossPay;
	                   netPay = grossPay - deduction;
	               }
	           }
	       }

	       //Print the regular pay
	       System.out.print("Regular pay is " +regularPay);
	       System.out.println();

	       //Print the Overtime pay
	       System.out.print("Overtime pay is " + overtimePay);
	       System.out.println();

	       //Print the total of regular pay and overtime pay
	       //System.out.print("6.Total of regular and overtime Pay : $"+grossPay);
	      // System.out.println();

	       //Print the retirement deduction
	       System.out.print("Retirement deduction is " + deduction);
	       System.out.println();

	       //Print the Net pay
	       System.out.print("Net Pay is..............."+netPay);
	       System.out.println();
	   }
	}


