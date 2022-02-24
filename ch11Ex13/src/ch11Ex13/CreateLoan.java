package ch11Ex13;

import java.util.Scanner;

public class CreateLoan implements LoanConstants{
	
	 public static void main(String[] args)
	    {
	        // write your code here
		   Loan arrLoan[] = new Loan[1];
	       Scanner sc = new Scanner(System.in);
	       double primeRate, amt;
	       int loanType, acctNum,term;
	      
	       String name;
	      
	       System.out.println("Welcome to " + COMPANY );
	       System.out.println("Enter the current prime interest rate as a decimal number, for example, .05");
	      
	       primeRate = Double.parseDouble(sc.nextLine());
	      
	       for(int i=0; i < arrLoan.length; i++)
	       {
	           System.out.println("Is this a (1) Business loan or (2) Personal loan");
	           loanType = Integer.parseInt(sc.nextLine());
	           if(loanType > 2) {
	        	   System.out.println("Please select proper loan type");
	               System.out.println("Is this a (1) Business loan or (2) Personal loan");
	                     loanType = Integer.parseInt(sc.nextLine());
	           }
	           
	          
	           System.out.println("Enter account number");
	           acctNum = Integer.parseInt(sc.nextLine());
	          
	           System.out.println("Enter name");
	           name = sc.nextLine();
	          
	           System.out.println("Enter loan amount");
	           amt = Double.parseDouble(sc.nextLine());
	          
	           System.out.println("Enter term");
	           term = Integer.parseInt(sc.nextLine());
	          
	           if(loanType == 1)          
	               arrLoan[i] = new BusinessLoan(acctNum, name, amt, term, primeRate);
	           else if(loanType == 2)          
	               arrLoan[i] = new PersonalLoan(acctNum, name, amt, term, primeRate);
	           else {
	               throw new IllegalArgumentException("Please Select proper loan type");
	           }          
	       }
	      
	       for(int j=0; j < arrLoan.length; j++)
	           System.out.println(arrLoan[j]);
	      
	       sc.close();
		 
		
	    }

}
