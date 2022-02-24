package ch11Ex3;

public class OnlineNewspaperSubscription extends NewspaperSubscription{
	//override the setAddress method
    @Override
    public void setAddress(String a)
    {
        // write your code here
    	//check if address contains @ char
    	if(a.contains("@")) {
    		this.address = a;
    		//set rate to 9
    		 rate = 9;
    	}
    	else {
    		System.out.println("Online Address Error");
    		this.address = "Error";
    		rate = 0.0;
    		
    	}
    }

}
