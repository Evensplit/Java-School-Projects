package ch9Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort2 {

	public static void main(String[] args) {
		
		//create an array of string size of 15
		final int size = 2;
		String[] words = new String[size];
		Scanner scanner = new Scanner(System.in);
		
		
		 {
		//read 15 string from user
		for(int i = 0; i < words.length; i++) {

			System.out.println("Enter a string ");
			if(words[i].equals("zzz")) {
			       break;}
			
			
			words[i] = scanner.nextLine();
		 }
		}
		//else {
			//System.out.println("you have exited");
		//}
		System.out.println("before sorting");
		System.out.println("--------------");
		
		//print string array unsorted
		for(String string: words) {
		System.out.println(string);
		}
		
		

	
		//call the method to sort alphabetically
		Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
	      for (int a = 0; a < words.length; a++)
	    	  
		//call the method sort on class Arrays
		Arrays.sort(words, 0, words.length - 1);
		System.out.println("After Sorting");
		System.out.println("--------------");
	
   
	//else{
		//System.out.println("Thanks for playing");
	
		
		
		
		
		
	
		
		
		//print sorted array elements
		for(String string: words) {
			System.out.println(string);
			
		}
		

	}

}
