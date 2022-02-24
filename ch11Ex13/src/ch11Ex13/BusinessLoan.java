package ch11Ex13;

public class BusinessLoan extends Loan {

	public BusinessLoan(int num, String name, double amt, int yrs,  double prime)
    {
        // write your code here
		   super(num, name, amt, yrs);
		   this.rate = prime + 0.01;
    }
}
