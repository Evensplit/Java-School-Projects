package ch6Ex1;

import java.util.Scanner;

public class CountByAnything {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		  final int START;
	      final int STOP = 500;
	      final int NUMBER_PER_LINE = 10;
	      int count = 0;
	      
	      System.out.println("Please enter an integer to count by ");
		  START = input.nextInt();

	      
	      for(int i = START; i <= STOP; i += START)
	      {
	         System.out.print(i + "  ");
	         count++;
	         
	         if(count % NUMBER_PER_LINE == 0)
	            System.out.println();
	             
	      }
		
		
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer to count by ");
		int num = input.nextInt();
		int count = 0;
		
		for(int i = num; i <= num * 100; i += num) {
			System.out.print(i + "   ");
			count++;
			if(count == 10) {
				System.out.println();
				 count = 0;
			}
		}*/
	}

}
