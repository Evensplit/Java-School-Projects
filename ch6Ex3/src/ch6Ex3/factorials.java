package ch6Ex3;

public class factorials {

	public static void main(String[] args) {
		
		int factorial;
		for(int i = 1; i <= 10; i++) {
			factorial = i;
			for(int j = i - 1; j > 0; j--) {
				factorial = factorial * j;
				
			}
			System.out.println("The factorial of " + i + " is " + factorial);
		} 

	}

}
