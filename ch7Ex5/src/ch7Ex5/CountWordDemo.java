package ch7Ex5;

import java.util.Scanner;

public class CountWordDemo {
	
	public static void main (String[] args)

	{
		int count = 0;
		boolean word = false;
		String str;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string ");
		str= scanner.nextLine();
		//run loop to count the number of words in sentence
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			 if(Character.isLetter(ch) && i != str.length()-1) {
				 word = true;
			 }
			 
			 //not a letter means the word counted
			 //increment count by 1 if ch is not letter and word is true (means a word)
			 
			 else if(!Character.isLetter(ch) && word) {
				 count++;
				 word = false;
			 }
				 //counf for lastword
			 //i is at last postiion and ch is letter, increment the word count by 1
			 
			 else if(Character.isLetter(ch) && i == str.length()-1) {
				 count++;
			 }
		}
			//print the count
		System.out.println("There are " + count + " words in the string");
		}
		

	}

	
	/*public static void main(String args[])
	  {
	   //Declare variables
	   String s1;
	   int i, count = 0;
	   // Declaring the Scanner object for keyboard entered data.
	   Scanner scanner = new Scanner(System.in);
	   // Asking the user to enter the String.
	   System.out.print("Enter a String : ");
	   // Storing the String.
	   s1 = scanner.nextLine();
	   
	   char ch[]= new char[s1.length()];
	   for(i = 0; i < s1.length(); i++)
	           {
	             ch[i]= s1.charAt(i);
	             
	             /*Check the separated by any combination of spaces 
	             
	       if( ((i > 0) && (ch[i] != ' ') && (ch[i-1] ==' ') || ((ch[0]!= ' ') && (i == 0) )))
	             count++;
	         }
	         //Display the output
	   System.out.println("There are "+ count +" words in the string");
	   

    }*/

