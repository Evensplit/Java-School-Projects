package ch8Ex1;

import java.util.Scanner;

public class InputCharacterInfo {
	 
	
    public static void main(String[] args) {
        
        char aChar;
        
        Scanner scnr = new Scanner(System.in);
        
        // System.out.println("The character is : ");
        
        System.out.println("Enter a character here : ");
        
        // aChar = scnr.next().charAt(0);
        
        /* use scnr.nextLine() to capture the whitespace character */
        aChar = scnr.nextLine().charAt(0); 
        
        System.out.println("The character is " + aChar);
        
        if(Character.isUpperCase(aChar)) 
                System.out.println(aChar + " is Uppercase");
        else
                System.out.println(aChar + " is not Uppercase");
        
        if(Character.isLowerCase(aChar))
                System.out.println(aChar + " is LowerCase");
        else
                System.out.println(aChar + " is not LowerCase");
        
        aChar = Character.toLowerCase(aChar);
        
        System.out.println("After tolowercase(), aChar is " + aChar);
        
        aChar = Character.toUpperCase(aChar);
        
        System.out.println("After touppercase(), aChar is " + aChar);
        
        /* use Character.isLetter(aChar), Character.isDigit(aChar), Character.isWhitespace(aChar) */
        
        if(Character.isLetter(aChar))
                System.out.println(aChar + " is a letter ");
        
        if(Character.isDigit(aChar))
                System.out.println(aChar + " is a digit");
        
        if(!Character.isLetter(aChar) && !Character.isDigit(aChar))
                System.out.println(aChar + " is neither a letter nor a digit");
        
        if(Character.isWhitespace(aChar))
                System.out.println(aChar + " is whitespace");
        
        if(!Character.isWhitespace(aChar))
                System.out.println(aChar + " is not whitespace");
        
        scnr.close();

}

	   
		   /*public static void main(String[] args) {
			   
		         
		       Scanner scanner = new Scanner(System.in);
		       
			   
		       System.out.println("Enter a character: ");
		       char aChar = scanner.next().charAt(0);
		   
		       System.out.println("The character is " + aChar);
		       
		       if (Character.isUpperCase(aChar)) {
		           System.out.println(aChar + " is uppercase");
		       } 
		       else {
		           System.out.println(aChar + " is not uppercase");
		       }
		      
		       if (Character.isLowerCase(aChar)) {
		           System.out.println(aChar + " is lowercase");
		           aChar = Character.toLowerCase(aChar);
			       System.out.println("After tolowerCase(), aChar is " + aChar);
			       
			       aChar = Character.toUpperCase(aChar);
			       System.out.println("After toUpperCase(), aChar is " + aChar);
		       }
		       else {
		       System.out.println(aChar + " is not lowercase");
		       aChar = Character.toLowerCase(aChar);
		       System.out.println("After tolowerCase(), aChar is " + aChar);
		       
		       aChar = Character.toUpperCase(aChar);
		       System.out.println("After toUpperCase(), aChar is " + aChar);
		       if(Character.isSpaceChar(aChar)){
			       System.out.println(aChar + " is a space character ");
			       }
		       }
		       if(Character.isLetterOrDigit(aChar)){
		       System.out.println(aChar + " a letter or digit ");
		       }
		       else {
		    	   System.out.println(aChar + " is neither a letter or digit ");
		       }
		       
		       if(Character.isWhitespace(aChar)) {
		    	   System.out.print(aChar + " is whitespace ");
		       }
		       else {
		       
		    	   System.out.print(aChar + " is not whitespace ");
		   }

		   }*/
}

