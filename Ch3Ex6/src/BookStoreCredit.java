import java.util.Scanner;

public class BookStoreCredit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name >> ");
        String name = input.nextLine();
        
        System.out.println("Enter your GPA >> ");
        double gpa = input.nextDouble();
        
        computeCredit(name, gpa);
	}

	public static void computeCredit(String student, double gpAverage) {
		
		double credit = gpAverage * 10;
		System.out.println(student + " your GPA of " + gpAverage + " has earned you a credit of " + credit );
		
	}

}
