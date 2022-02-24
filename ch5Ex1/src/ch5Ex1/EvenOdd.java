package ch5Ex1;

import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        int userInput;
        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Enter a integer number >>");
        userInput = scanObj.nextInt();
        isEven(userInput);
        
    }
    public static boolean isEven(int number) {
    	int userInput = number;
		if(userInput  % 2 == 0) {
			System.out.println(number + " is even");
		}
		else {
			System.out.print(number + " is odd");
		}
		return false;
		
    }
}
