package ch7Ex3a;

import java.util.Scanner;

public class CountSpaces {
	    public static void main(String[] args) {
	       //Q3b String myQuote = "Do or Die or die or die";
	    	String myQuote;
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Enter you quote");
	    	myQuote = input.nextLine();
	        System.out.println("Number of spaces is " + calculateSpaces(myQuote));
	    }

	    public static int calculateSpaces(String inString) {
	    	
	        int count = 0;
	        for (int i = 0; i < inString.length(); i++) {
	            if (inString.charAt(i) == ' ') {
	                ++count;
	            }
	        }
	        return count;
	    }
	}


	
        
		
		
	
	/*String aString = "no matter what, youre great";
		int numSpaces = 0;
		int stringLength = aString.length();
		
		
		for(int i = 0; i < stringLength; i++) {
			char ch = aString.charAt(i);//looks at char in position i as iterating thru loop
			if (ch == ' ') {
				numSpaces++;
				
			}
			
			
		}
         System.out.println("the number of spaces is " + numSpaces);
	}*/
    


