package ch8Ex10;


	import java.time.*;
	public class CertOfDeposit {
	    private int certNum;
	    private String lastName;
	    private double balance;
	    private LocalDate issueDate;
	    private LocalDate maturityDate;
	    
	    public CertOfDeposit(int certNum, String lastName, double balance, LocalDate issueDate) {
	    	
	    	 this.certNum = certNum;
	    	 this.lastName = lastName;
	         this.balance = balance;
	         this.issueDate = issueDate;
	         this.maturityDate = issueDate.plusYears(1);
	    }
	    
	    
	   
		public void setCertNum(int n) {
	    	this.certNum = n;
	    }
	    public void setName(String name) {
	    	this.lastName = name;
	    }
	    public void setBalance(double bal) {
	    	this.balance = bal;
	    }
	    public void issueDate(LocalDate date) {
	    	this.issueDate = date;
	    }
	    public int getCertNum() {
	    	return certNum;
	    }
	    public String getName() {
	    	return lastName;
	    }
	    public double getBalance() {
	    	return balance;
	    }
	    public LocalDate getIssueDate() {
	    	return issueDate;
	    }
	    public LocalDate getMaturityDate() {
	    	return maturityDate;
	    }

		
	}


