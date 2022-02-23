package ch3case2Problems;

public class Rental {
	
	    public static final int MINUTES_IN_AN_HOUR = 60;
	    public static final int HOURLY_RENTAL_RATE = 40;

	    private String mContractNumber;
	    private int mRentalHours;
	    private int mExtraRentalMinutesOverHour;
	    private int mPrice;

	    //
	     //Sets the contract number
	     
	    public void setContractNumber(String contractNumber){
	        mContractNumber = contractNumber;
	    }

	    
	     //takes minutes as param, and sets
	    // hour, minutes over an hour and total rental price
	     // @param minutes
	    
	    public void setHoursAndMinutes(int minutes){
	        //If total minutes is greater than 60, mRentalHours
	        //is a positive value, or else its 0
	        //For less than an hour, the price is assumed to be $40
	        if(minutes >= MINUTES_IN_AN_HOUR){
	            mRentalHours = minutes/MINUTES_IN_AN_HOUR;
	            mExtraRentalMinutesOverHour = minutes % MINUTES_IN_AN_HOUR;
	            //Since for every extra minute it costs $1
	            mPrice = (mRentalHours * HOURLY_RENTAL_RATE) + (mExtraRentalMinutesOverHour);
	        }
	        else {
	            mPrice = 40;
	        }
	    }

	    /*
	     * Returns the contract number
	     * @return
	     */
	    public String getContractNumber() {
	        return mContractNumber;
	    }

	    /*
	     * Returns the hours for which the supply is rented
	     * @return
	     */
	    public int getRentalHours(){
	        return mRentalHours;
	    }

	    /*
	     * Returns the extra minutes over an
	     * hour, for which the supply was rented
	     * 
	     */
	    public int getExtraMinutesOverAnHour(){
	        return mExtraRentalMinutesOverHour;
	    }

	    /*
	     * Returns the total price
	     * 
	     */
	    public int getPrice(){
	        return mPrice;
	    }
	}


