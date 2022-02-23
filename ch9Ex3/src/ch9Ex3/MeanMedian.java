package ch9Ex3;

import java.util.Scanner;
import java.util.*;
public class MeanMedian {
	
	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
		   double sum = 0;
		   
		   ArrayList<Integer> list = new ArrayList<Integer>();
		   
		   for(int i = 0; i < 9; i++){
		       System.out.print("Enter number "+ (i + 1));
		       list.add(scanner.nextInt());
		       sum += list.get(i);
		   }
		   
		   Collections.sort(list);
		   double mean = sum / 2;
		   int median = list.get(9 / 2);
		   System.out.println("You entered: ");
		   for(int i = 0; i < 9; i++){
		       System.out.print(list.get(i) + ", ");
		       }
		   
		   System.out.println("the mean is " + mean + " and the median is " + median);
		   
		  
		   }
	  
	   
	
	
	
	
	
	
	
	
}	