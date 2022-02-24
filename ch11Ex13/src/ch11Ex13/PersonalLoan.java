package ch11Ex13;

public class PersonalLoan extends Loan{
	

    public PersonalLoan(int num, String name, double amt, int yrs,  double prime)
    {
        // write your code here
    	super(num, name, amt, yrs);
        this.rate = prime + 0.02;
    }

}
