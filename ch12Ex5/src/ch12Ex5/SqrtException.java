package ch12Ex5;

import java.util.Scanner;

public class SqrtException {
	public static void main(String[] args) throws ArithmeticException  {
		 int val;

        //Scanner class object
        Scanner reader = new Scanner(System.in);
      
        try {
            //Prompting user
            System.out.print("\n Enter a value: ");
          
            //Reading value from user
            val = reader.nextInt();
          
            //Checking value
            if(val < 0) {
              
                //Throwing an exception
                throw new ArithmeticException();
            }
          
            //Trying to calculate Square root and printing result
            System.out.printf("\n Number: %d, Square root: %.2f \n", val, Math.sqrt(val));
        }
        //Catching Exception
        catch(ArithmeticException ex) {
            //Printing exception
            System.out.println(" Cant take square root of negative number ");
		
	}
}
}
       /* Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = in.nextDouble();

        try {
            if (n < 0)
                throw new ArithmeticException();
            double result = Math.sqrt(n);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't take square root of negative number.");
        }
    }

}*/