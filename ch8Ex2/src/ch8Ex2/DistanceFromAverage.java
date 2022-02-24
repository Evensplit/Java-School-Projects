package ch8Ex2;

import java.util.Scanner;

public class DistanceFromAverage {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        double[] array = new double[15];
	        double n;
	        int count = 0;
	        System.out.println("Enter a numeric value or 99999 to quit>> ");
	        for (int i = 0; i < array.length; i++) {
	            n = in.nextDouble();
	            if (n == 99999) {
	                break;
	            }
	            array[count++] = n;
	        }
	        if (count == 0) {
	            System.out.println("No values entered.");
	        } else {
	            double total = 0;
	            for (int i = 0; i < count; i++) {
	                total += array[i];
	            }
	            double average = total / count;
	            System.out.println("You've entered " + count + " numbers and the average is " + average);
	            for (int i = 0; i < count; i++) {
	                System.out.println(array[i] + " distance from average: " + (array[i] - average));
	            }
	        }
	    }
}
