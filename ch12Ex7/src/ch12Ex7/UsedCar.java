package ch12Ex7;

public class UsedCar {

	String vin;
    String make;
    int year;
    int mileage;
    int price;
    public final static String DEFAULT_VIN = "999";
    final int VIN_NUM_LENGTH = 4;
    final int LOW_YEAR = 1997;
    final int HIGH_YEAR = 2017;
    final String[] MAKES = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
    
    public UsedCar(String num, String carMake,
                   int carYear, int miles, int pr) throws UsedCarException {
        // Write your code here
    	 boolean validMake = false;
         for (int i = 0; i < MAKES.length; i++) {
             if (MAKES[i].equals(carMake)) validMake = true;
         }
         if (num.length() != VIN_NUM_LENGTH || !validMake || (carYear < LOW_YEAR || carYear > HIGH_YEAR) || miles < 0 || pr < 0)
             throw new UsedCarException(num);

         vin = num;
         make = carMake;
         year = carYear;
         mileage = miles;
         price = pr;
    	
    	
    }
    	/*if(vin.length()!=VIN_NUM_LENGTH)
    		throw new UsedCarException(vin+ " is not four digits.");
    		else if(!(carMake.equalsIgnoreCase("Ford")||
    		carMake.equalsIgnoreCase("Honda")||
    		carMake.equalsIgnoreCase("Toyota")||
    		carMake.equalsIgnoreCase("Chrysler")||
    		carMake.equalsIgnoreCase("Other")))
    		{
    		throw new UsedCarException(carMake+" is not valid make....");
    		}
    		else if (carYear<LOW_YEAR || carYear>HIGH_YEAR)
    		{
    		throw new UsedCarException(carYear+ " must be between "+LOW_YEAR+" and "+HIGH_YEAR);
    		}
    		else if(pr<0)
    		{
    		throw new UsedCarException(pr+" must be a positive value.");
    		}
    		else
    		{
    		this.vin = vin;
    		this.year = carYear;
    		this.make = carMake;
    		this.mileage = miles;
    		this.price = pr;
    		}
    		}*/
    
    
    public UsedCar() {
        // Write your code here
    	vin = DEFAULT_VIN;
    	year = LOW_YEAR;
    	make = "";
    	mileage = 0;
    	price = 0;
    }
    
    public String getVin() {
        // Write your code here
    	return vin;
    }
    
    public String toString() {
        return "VIN " + vin + "  Make: " + make +
               "\n   Year: " + year + "  " + mileage + " miles   $" +
               price;
    }
}

