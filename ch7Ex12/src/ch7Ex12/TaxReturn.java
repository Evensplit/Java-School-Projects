package ch7Ex12;
import java.util.*;
public class TaxReturn {
	  private String ssn;
	    private String last;
	    private String first;
	    private String address;
	    private String city;
	    private String state;
	    private String zipCode;
	    private double income;
	    private char status;
	    private double tax;
	    private final double LOWINCOME = 20000;
	    private final double HIGHINCOME = 50000;
	    private final double SINGLELOW = 0.15;
	    private final double SINGLEMED = 0.22;
	    private final double SINGLEHIGH = 0.30;
	    private final double MARRIEDLOW = 0.14;
	    private final double MARRIEDMED = 0.20;
	    private final double MARRIEDHIGH = 0.28;
	

	    
	    	public TaxReturn(String socSec, String lastName,
                    String firstName, String add, String cty, String st,
                    String zip, double inc, char stat) {
	    	this.ssn = socSec;
	        this.last = lastName;
	        this.first = firstName;
	        this.address = add;
	        this.city = cty;
	        this.state = st;
	        this.zipCode = zip;
	        this.income = inc;
	        this.status = stat;
	        
	        //write code here
	     // checking income and status to cal the tax
	       
	        
	        
	        
	        
	        if (income <= 20000) {
	            if (status == 'S')
	                tax = income * 0.15;
	            else
	                tax = income * 0.14;
	        } else if (income > 20000 && income <= 50000) {
	            if (status == 'S') {
	                tax = income * 0.22;
	               // tax = tax + (income - tax) * 0.22;
	            } else {
	                tax = income * 0.20;
	                //tax = tax + (income - 20000) * 0.2;
	            }
	        } else if (income > 50000) {
	            if (status == 'S') {
	                tax = income * 0.30;
	                //tax = tax + (30000) * 0.22;
	               // tax = tax + (income - 50000) * .3;
	            } else {
	                tax = income * 0.28;
	                //tax = tax + (30000) * 0.2;
	               // tax = tax + (income - 50000) * .28;
	            }
	         }
	    }

	    

	    //getter function that returns taxLiability
	    public double getTax(){
	        return tax;
	    }
	    public void display() {
	        System.out.println("Taxpayer ssn: " + ssn + " " + last + " " + first + "\n" +
	                           address + "\n" + city + ", " + state + " " + zipCode +
	                           "\n Marital status: " + status + "\n" +
	                           "Income: $" + income + "  Tax: $" + tax);
	    }
	}



