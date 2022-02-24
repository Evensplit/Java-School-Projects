package ch8Ex8;


//import the required classes

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class BirthdayReminder

{

   // main method

   public static void main(String[] args) throws IOException

   {

        // declare the required variables

        String sName = null;

        String names[] = new String[10];

        String birthDates[] = new String[10];

        int count = 0;

        boolean flag = false;

        // to read values from the console

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(

                 System.in));

        // loop till the user enters 10 names or user enters ZZZ

        for (int i = 0; i < 10; i++)

        {

            // prompt the user to enter the name

            System.out.print("Please enter person name: ");

            sName = dataIn.readLine();

            // check the condition whether the user enters

            // ZZZ if so break the loop

            if (sName.equalsIgnoreCase("ZZZ"))

                 break;

            // else assign the value to the names array

            names[i] = sName;

            // prompt the user to enter the date of birth

            System.out.print("Enter Date of Birth as(dd-mm-yyyy): ");

            birthDates[i] = dataIn.readLine();

            count = count + 1;

        }

        // print the count value

        System.out.println("The count of names is:" + count);

        // print the list of names

        System.out.println("The list of names:");

        for (int i = 0; i < count; i++)

        {

            System.out.println(names[i]);

        }

        // loop till the user enters ZZZ

        do

        {

            // prompt the user to enter the name

            System.out.println("Enter a name: ");

            sName = dataIn.readLine();

            // check the condition for the user entered ZZZ

            // if so break the loop

            if (sName.equalsIgnoreCase("ZZZ"))

                 break;

            // else search the name and display the respective date

            // of birth

            for (int i = 0; i < count; i++)

            {

                 if (sName.equalsIgnoreCase(names[i]))

                 {

                      System.out.println(sName + "'s birthday is on "

                                + birthDates[i]);

                      flag = true;

                      break;

                 }

            }

            // if the flag value is false then display the error message

            if (flag == false)

                 System.out.println("Sorry entry for" + sName);

        } while (true);

   }

}
/*import java.util.Scanner;

public class BirthdayReminder {
	
	public static void main(String[]args) {
		
		String sentinal = "ZZZ";
		final int size = 10;
		int count = 0;
		String name = null;
		String dateOfBirth = null;
		String[] names = new String[size];
		String[] birthdays = new String[size];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name or enter ZZZ to quit");
		name = scanner.nextLine();
		
		//check if string var name is not equal to ZZZ and count value
		//..is less than 10
		while(!name.equals(sentinal) && count < 10) {
			System.out.println("Enter birthdate with slashes between the month, day, and year (dd/mm/yyyy) ");
			//get birthdate
			dateOfBirth = scanner.nextLine();
			//assign and set name and date of birth in arrays
			names[count] = name;
			birthdays[count] = dateOfBirth;
			
			System.out.println("Enter a name or enter ZZZ to quit ");
			name = scanner.nextLine();
			count++;
			
	}
		
		System.out.println("The count of names entered " + count);
		//System.out.println("list of  names" );
		for(int i = 0; i < count; i++) {
			System.out.println(names[i]);
		}
		//initialize repeat var with the value as true of Boolean type
		boolean repeat = true;
		boolean found = false;
		while(repeat) {
			System.out.println("Enter a name to " + "display the date of " +
		"birth of that person" + " or enter ZZZ to quit");
			name = scanner.nextLine();
			//check if name and value is equal to sentinal
			//if yes, set the value to false to the boolean
			//var name repeat
			if(name.equals(sentinal)) {
				repeat = false;
			}
			else {
				//for loop to check whether the user given name input
				//matches with the array of names before by
				//the user input
				for(int i = 0; i < count && !found; i++) {
					if(names[i].equals(name)) {
						//set bool var found as true
						found = true;
						dateOfBirth = birthdays[i];
					}
				}
			//if condition to check if the value of found is true or not
				if(found)
					System.out.println("Date of birth of " + name + " is " + dateOfBirth);
				else 
					System.out.println("Sorry, no entry for " + name);
				
				found = false;
					
		}

			
	}

}
}*/