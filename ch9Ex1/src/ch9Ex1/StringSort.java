package ch9Ex1;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		
		String[] values =  {"mouse", "dog", "cat", "horse", "cow",
		         "moose", "tiger", "lion", "elephant", "bird", "hamster",
		         "guinea pig", "leopard", "aardvark", "hummingbird"}; 
		
				
		
		System.out.println("before sorting");
		System.out.println("--------------");
		
		
		// print array 
		for(String string: values)
			System.out.println(string);
		
		// call the method sort on class arrays
		System.out.println(" ");
		
		Arrays.sort(values, String.CASE_INSENSITIVE_ORDER);
	      for (int a = 0; a < values.length; a++) {
	         //System.out.println(values[a]);
	      }
		Arrays.sort(values, 0, values.length - 1);
		System.out.println("After Sorting");
		System.out.println("--------------");
	
		
		
		//print sorted array elements
		for(String string: values) {
			System.out.println(string);
			
		}
		
		
		}
}
