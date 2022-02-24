package ch7Ex4B;

import java.util.Scanner;

public class ValidatePassword {
	public static void main(String[] args) {
	

//  create object of Scanner class
  Scanner s= new Scanner(System.in);
 
System.out.print("\nEnter Password : ");

//ask user for input
String pass = s.next();

//while pass is not valid keep taking password
while(! password_checkor(pass)) {

System.out.print("\nPlease Re-Enter your password : ");

pass=s.next();

}


 
 
}


//method for password validating
public static boolean password_checkor(String str) {
 
//  declare local variables
 
  int upper=0;
  int lower =0;
  int digit=0;
 
//  iterate over whole String
 
  for(int i=0;i<str.length();i++) {

//      if character is letter
     
      if(Character.isLetter(str.charAt(i))) {
         
//          if letter is of lower-case
          if(Character.isLowerCase(str.charAt(i))) {
              lower++;
          }
         
//          if letter is if uppercase
          else if(Character.isUpperCase(str.charAt(i))) {
              upper++;
          }
         
      }
     
//      if character is digit
      else if(Character.isDigit(str.charAt(i))) {
     
          digit++;
      }
     
  }
 
 
 
//  check for valid password and return appropriate reason
 
  if(upper >=2 && lower >= 3 && digit >=1) {
     
      System.out.println("Password is Valid!!!");
     
      return true;
     
  }
 
  else if(upper < 2) {
 
      System.out.println("Invalid Password!!");
      System.out.println(" The password did not have enough of the following: ");
      System.out.println("uppercase letters ");
     
      return false;
  }
 
  else if(lower < 3) {
     
      System.out.println("Invalid Password!!");
      System.out.println(" The password did not have enough of the following: ");
      System.out.println("lowercase letters ");
     
      
     
      return false;
  }
 
  else if(digit < 1) {
     
      System.out.println("Invalid Password!!");
      System.out.println(" The password did not have enough of the following: ");
      System.out.println("Digits ");
     
      
     
      return false;
  }
 
  return false;
}

}	/*public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        final int NUM_UPPER_LETTERS = 2;
        final int NUM_LOWER_LETTERS = 3;
        final int NUM_DIGITS = 1;
		
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		int stringLength;
		String aString;
		int numSpaces = 0;


		System.out.println("Enter your password>> ");
		aString = in.nextLine();
		stringLength = aString.length();
		
		for(int i = 0; i < stringLength; i++) {
			char ch = aString.charAt(i);
			if(Character.isUpperCase(ch)) 
				upperCount++;
		
				else
					if(Character.isLowerCase(ch)) 
						lowerCount++;
					
						else
							if(Character.isDigit(ch)) 
								digitCount++;
							
		}
			
			if(upperCount <= NUM_UPPER_LETTERS && lowerCount >= NUM_LOWER_LETTERS
				&& digitCount >= NUM_DIGITS)
               System.out.println("Valid Password");
			     
			
			else {
				System.out.println("The password did not have enough of the following: ");
				if(upperCount < NUM_UPPER_LETTERS)
					System.out.println("upper case letters - at least 2 are required");
				if(lowerCount < NUM_LOWER_LETTERS)
					System.out.println("lower case letters - at least 3 are required");
				if(digitCount < NUM_DIGITS)
					System.out.println("digits ");

				
				
			}
			
		}
		

	}*/


