package ch6Ex2;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter an even number or 999 to quit ");
        int num = input.nextInt();
        
        while(num != 999) {
        	if(num % 2 == 0){
        	   System.out.print("Good Job ");
        	}
        	else {
        		System.out.print(num + " is not an even number ");
        	}
        	System.out.print("please enter an even number or 999 to quit ");
            num = input.nextInt();
        }
        System.out.print("Good Bye ");
      }
        


}
