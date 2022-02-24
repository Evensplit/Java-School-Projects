package ch3caseProblems;


public class Event {
      public final static int PRICE_PER_GUEST = 35;
	   public final static int CUT_OFF = 50;
	  
	   //Attributes
	   private String eventNumber;
	   private int guest;
	   private int price;
	  
	   
	   //event number  the eventNum to set
	   
	   public void setEventNumber(String eventNum) {
	       this.eventNumber = eventNum;
	   }
	  
	   /**
	   * @param noOfGuest the noOfGuest to set*/
	   
	   public void setGuest(int noOfGuest) {
	       this.guest = noOfGuest;
	       this.price = this.guest * PRICE_PER_GUEST;
  }
	  
	   
	   // @return the eventNumber
	   
	   public String getEventNumber() {
	       return eventNumber;
	   }
	  
	  
	   //@return the noOfGuest
	   
	   public int getGuests() {
	       return guest;
	   }
	  
	   
	   // @return the price
	   
	   public int getPrice() {
	       return price;
	   }
}
