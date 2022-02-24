package ch8Ex4;

public class ArrayMethodDemo {
	public static void main (String args[]) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        // Write your code here
    	for(int val : numbers) {
    		System.out.print(val + " ");
     }
    	System.out.println();
    }
    public static void displayReverse(int[] numbers) {
        // Write your code here
    	for(int i = numbers.length -1; i >= 0; --i) {
    		System.out.print(numbers[i] + " ");
    		
    	}
    	System.out.println();
    }
    public static void displaySum(int[] numbers) {
        // Write your code here
    	int sum = 0;
    	for(int  i : numbers) {
    		sum += i;
    	}
    	System.out.println(sum);
    }
    public static void displayLessThan(int[] numbers, int limit) {
        // Write your code here
    	for(int val : numbers) {
    		if(val < limit) {
    			System.out.print(val + " ");
    		}
    		
     }
    	System.out.println();
    }
    public static void displayHigherThanAverage(int[] numbers) {
        // Write your code here
    	int sum = 0;
    	for(int val : numbers) {
    		sum += val;
    	}
    	double average = sum / numbers.length;
    	for(int val : numbers) {
    		if(val > average) {
    			System.out.print(val + " ");
    		}
    }
    	System.out.println();
 }

}

