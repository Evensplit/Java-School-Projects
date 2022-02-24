package ch7Ex10;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	String phrase;
	String str;
	int len, i;
	str = "";
	System.out.print("Enter a string or Phrase : ");
	phrase = input.nextLine();
	phrase = phrase.replaceAll("\\W",""); // replaceAll() - to replace all special character
	len = phrase.length(); //to get a length of a phrase

	for(i = len - 1; i >= 0; i--)
	{
	str= str + phrase.charAt(i); //charAt() - to get the character at specified index
	}
	if(phrase.equalsIgnoreCase(str))
	{
	System.out.println("You entered a palindrome.");
	}
	else
	{
	System.out.println("You did not enter a palindrome.");
	}
	System.out.println("\n");

}
}