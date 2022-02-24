package ch11Ex3;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {
	
	public void setAddress(String a)
    {
        // write your code here
		if(containsDigit(a)) {
			this.address = a;
			rate = 15;
		}
		else {
			System.out.println("Physical Address Error");
			//set address
			this.address = " Error";
			//set rate to 0
			rate = 0.0;
		}
    }//end of method setAddress
	
	//the method containsDigit returns true if address
	//contains digit otherwise returns false
	private boolean containsDigit(String address)
	{
		boolean found = false;
		for(int i = 0; i < address.length() && !found; i++) {
			if(Character.isDigit(address.charAt(i))) {
				found = true;
				
			}
			
		}
		return found;
	}

}
