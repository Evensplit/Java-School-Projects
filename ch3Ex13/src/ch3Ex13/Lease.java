package ch3Ex13;

public class Lease {
    private static final double PET_FEE = 10;
    private String name;
    private int aptNumber;
    private double rent;
    private int term;
    int addPetfee;

    //Default constructor
    public Lease()
    {
        name ="XXX";
        aptNumber =0;
        rent = 1000;
        term =12;
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber= aptNumber;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
    public double getAddPetFee()
    {
        //adds $10
       return rent+=PET_FEE;
    }
    public static void explainPetPolicy()
    {
        System.out.println("Add $10 to rent as pet fee.");
    }
}
/*class Lease {
    private String name;
    private int aptNumber;
    private double rent;
    private int term;
    private static final int FEE = 10;

    
    	 public Lease() {
    	        name = "XXX";
    	        aptNumber = 0;
    	        rent = 1000;
    	        term = 12;
    }

    public String setName(String tenant) {
    	return tenant;
    }

    public int setAptNumber(int apt) {
    	return apt;
    }

    public double setRent(double rent) {
    	return rent;
    }

    public int setTerm(int t) {
    	return t;
    }

    public String getName() {
    	return name;
    }

    public int getAptNumber() {
    	return aptNumber;
    }

    public double getRent() {
    	return rent;
    }

    public int getTerm() {
    	return term;
    }

    public void getFee() {
    	rent += 10;
    }

    public static void explainPetPolicy() {
    	System.out.println("A pet fee of $10 is added to the monthly rent.");
    }

	public int setLeasePeriod(int leasePeriod) {
		return leasePeriod;
		
	}

	
}*/




/*public class Lease {
	private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int terms;

    public Lease() {
        tenantName = "XXX";
        apartmentNumber = 0;
        monthlyRent = 1000;
        terms = 12;
    }

    public String getTenantName() {
        return tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public int getTerms() {
        return terms;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public void addPetFee() {
        monthlyRent += 10;
    }

    public static void explainPetPolicy() {

        System.out.println("A pet fee of $10 is added to the monthly rent.");
    }
}*/
