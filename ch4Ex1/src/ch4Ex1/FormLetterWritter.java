package ch4Ex1;

public class FormLetterWritter {

	public static void main(String[] args) {
		displaySalutation("Kelly");
		displayLetter();
		displaySalutation("Christy", "Johnston");
		displayLetter();

	}
	private static void displaySalutation(String lastName) {
		System.out.println("Dear Mr or Ms " + lastName + ",");
		
		
	}
	
	private static void displaySalutation(String firstName, String lastName) {
		System.out.println("Dear " + firstName +  " " + lastName + ",");
		
		
	}

	
	private static void displayLetter() {
		System.out.println("Thank you for your service ");
		
		
	}

}
