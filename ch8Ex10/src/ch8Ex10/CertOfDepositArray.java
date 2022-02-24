package ch8Ex10;

import java.time.LocalDate;
import java.util.Scanner;

public class CertOfDepositArray {
	

	public static void main(String[] args) {
        // Write your code here
	
			       Scanner input = new Scanner(System.in);

			//Declare variables and constants
			       int certNumber;
			       String name;
			       double balance;
			       int day;
			       int month;
			       int year;
			       final int size = 2;

			//Adding an array of 5 types deposit
			       CertOfDeposit[] deposit = new CertOfDeposit[size];

			//Loop to prompt for user values
			       for (int x = 0; x < deposit.length; x++) {
			           // Prompt user to enter certificate #
			           System.out.println("Enter certificate number : ");
			           certNumber = input.nextInt();

			           // Prompt user to enter name
			           System.out.print("Enter last name of owner ");
			           name = input.next();
			           // Prompt user to enter balance
			           System.out.print("Enter balance : >> ");
			           balance = input.nextDouble();
			           
			        // Prompt user to enter month
			           System.out.print("Enter month of issue ");
			           month = input.nextInt();
			          
			           System.out.print("Enter day of issue ");
			           day = input.nextInt();
			           
			          
			           System.out.print("Enter year of issue ");
			           year = input.nextInt();
			           input.nextLine();

			           // Creating a local date object
			           LocalDate issueDate = LocalDate.of(year, month, day);
			           // object of cert of dep
			           deposit[x] = new CertOfDeposit(certNumber, name, balance, issueDate);
			       }
			//Display 5 objects
			       for (int x = 0; x < deposit.length; ++x) {
			           System.out.println("Certificate number : " + deposit[x].getCertNum());
			           System.out.println("Name : " + deposit[x].getName());
			           System.out.println("Issued : " + deposit[x].getIssueDate());
			           System.out.println("Matures: " + deposit[x].getMaturityDate());
			       }
	}
	}	
		/*int certNum;
		String name;
		double balance;
		int day;
		int month;
		int year;
		
		Scanner scanner = new Scanner(System.in);
		final int size = 5;
		
		//create an array of five of the type of certOfDeposits
		CertOfDeposit[] deposit = new CertOfDeposit[size];
		
		// for loop to prompt users for values
		
		for(int y = 0; y <= deposit.length; y++);
		{
		System.out.println("Enter certificat number ");
		certNum = Integer.parseInt(scanner.nextLine());
		System.out.println("Name ");
		name = scanner.nextLine();
		
		System.out.println("balance ");
		balance = scanner.nextDouble();
		
		System.out.println("Enter issue date ");
		System.out.println("Enter day ");
		day = scanner.nextInt();
		
		System.out.println("Enter month ");
		month = scanner.nextInt();
		
		System.out.println("Enter year ");
		year = scanner.nextInt();
		
		scanner.nextLine();
		
		
		//create a LocalDate object with day, month year
		LocalDate issueDate = LocalDate.of(year, month, day);
		
		
		
		//instantiate an object of CerOfDepost class and set 
		//object at index, i value
		deposit[i] = new CertOfDeposit(certNum, name, balance, issueDate);
		
		}
		for(int x = 0; x < deposit.length; x++) 
			
			System.out.println("Certification number " + deposit[i].getCertNum());
			System.out.println("Name " + deposit[i].getName());
			System.out.println("Balance " + deposit[i].getBalance());
			System.out.println("Issue date" + deposit[i].getIssueDate());
			System.out.println("Maturity date " + deposit[i].getMaturityDate());
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}       
  /*  public static void display(CertOfDeposit cd)
    {
        System.out.println("Certificate " + cd.getCertNum() +
        "\nName: " + cd.getName() + 
        "\nBalance: $" + cd.getBalance() +
        "\nIssued: " + cd.getIssueDate() +
        "\nMatures: " + cd.getMaturityDate());
    }*/


