package ch3Ex13;

import java.util.Scanner;

class TestLease{



   public static void main (String args[]) {

	   {
	        Lease lease1 = new Lease();
	        Lease lease2 = new Lease();
	        Lease lease3 = new Lease();
	        Lease lease4 = new Lease();//leave it with default values

	        //Call three times getData()
	        lease1 = getData();
	        lease2 = getData();
	        lease3 = getData();
	        System.out.println("Display info of tenants\n\n");
	        //Print info
	        showValues(lease1);
	        showValues(lease2);
	        showValues(lease3);
	        showValues(lease4);
	        System.out.print("\n");
	        //call the getFee()
	        lease1.getAddPetFee();
	        //explain pet policy
	        Lease.explainPetPolicy();
	        //to confirm changes
	        showValues(lease1);
	    }
   }
   public static void showValues(Lease ls)
   {
      System.out.print("\n\n");

       System.out.println("Tenants Name: "+ls.getName()+"\nApartment Number: "+ls.getAptNumber()+"\nMonthly rent: "+ /*NumberFormat.getCurrencyInstance().format(ls.getRent())*/  "\nTerm of Lease in month: "+ls.getTerm());
      System.out.print("\n\n");
   }

  public static Lease getData()
   {
	  Scanner scanner = new Scanner(System.in);
      Lease lease = new Lease();
      
      System.out.print("Enter tenant's name: ");
      lease.setName(scanner.nextLine());
      
      System.out.print("Enter apartment number: ");
      lease.setAptNumber(scanner.nextInt());
      
      System.out.print("Enter monthly rent: $");
      lease.setRent(scanner.nextDouble());
      
      System.out.print("Enter term of lease in months: ");
      lease.setTerm(scanner.nextInt());
      return lease;
   }
}




/*public class TestLease {

	
    
		

	    // return a Lease object
	    public static Lease getData() {
	    	Scanner input = new Scanner(System.in);
	    	
	        System.out.println("Enter tenant name: ");
	        String name = input.nextLine();
	        
	        System.out.print("Enter apartment number: ");
	        int num = input.nextInt();
	        
	        System.out.print("Enter monthly rent: ");
	        double rent = input.nextDouble();
	        
	        System.out.print("Enter the number of terms: ");
	        int terms = input.nextInt();
	       // input.nextLine();

	        Lease lease = new Lease();
	        lease.setTenantName(name);
	        lease.setApartmentNumber(num);
	        lease.setMonthlyRent(rent);
	        lease.setTerms(terms);

	        return lease;
	    }

	    static void showValues(Lease lease) {

	        System.out.println("Tenent name: " + lease.getTenantName());
	        System.out.println("Apartment number: " + lease.getApartmentNumber());
	        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
	        System.out.println("Terms: " + lease.getTerms());
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        Lease l1;
	        Lease l2;
	        Lease l3;
	        Lease l4;

	        l1 = getData();
	        l2 = getData();
	        l3 = getData();
	        l4 = new Lease();

	        showValues(l1);//pass one of the Lease objects to the showValues()

	        //        then call the addPetFee() method using the passed Lease object and confirm that the fee explanation statement is displayed
	        l1.addPetFee();
	        l1.explainPetPolicy();

	        showValues(l1); //call the showValues() method for the Lease object again


	        showValues(l2);
	        showValues(l3);
	        //default constructor
	       // showValues(l4);
	    
	    }
	
	}*/


