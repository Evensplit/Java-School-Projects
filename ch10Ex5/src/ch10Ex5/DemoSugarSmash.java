package ch10Ex5;

public class DemoSugarSmash {
	public static void main(String[] args)
	   {
	       System.out.println("SugarSmashPlayer Class Object1: ");
	       //Create an instance of SugarSmashPlayer
	       SugarSmashPlayer sugarPlayer=new SugarSmashPlayer();
	    
	       //set the screen name
	       sugarPlayer.setName("Black");
	       //set the ID    
	       sugarPlayer.setID(1111);
	    
	       //Set score less than 100 at game level=0
	       //Print an error message since score <100
	       sugarPlayer.setScore(50, 0);
	    
	       //Set score less than 100 at game level=1
	       //Print an error message since score <100
	       sugarPlayer.setScore(70, 1);
	    
	       //Set score less than 100 at game level=2
	       sugarPlayer.setScore(120, 2);

	       System.out.println("SugarPlayer Name: "
	       +sugarPlayer.getName());
	       System.out.println("SugarPlayer ID: "
	       +sugarPlayer.getID());
	       System.out.println("Score : "
	                   +sugarPlayer.getScore(0));
	       //Other scores are set to zero
	       System.out.println("Score : "
	                   +sugarPlayer.getScore(1));
	       System.out.println("Score : "
	                   +sugarPlayer.getScore(2));

	       System.out.println();          
	       System.out.println("PremiumSugarSmashPlayer Class Object1: ");
	       PremiumSugarSmashPlayer premiumPlayer1=
	               new PremiumSugarSmashPlayer(2.00);

	       //Set score to level 0 given an error message
	       premiumPlayer1.setScore(15, 0);    
	       premiumPlayer1.setID(1234);
	    
	       //set the screen Name
	       premiumPlayer1.setName("Blue");    
	       System.out.println("PremiumSugarSmashPlayer ID: "
	               +premiumPlayer1.getID());
	    
	       System.out.println("PremiumSugarSmashPlayer Name: "
	               +premiumPlayer1.getName());
	    
	       System.out.println("PremiumSugarSmashPlayer Score: "
	               +premiumPlayer1.getScore(0));
	    
	       System.out.println("\nPremiumSugarSmashPlayer Class Object2:");
	       //Create an instance of PremiumSugarSmashPlayer
	       //with pay $3 dollars
	       PremiumSugarSmashPlayer premiumPlayer=
	               new PremiumSugarSmashPlayer(3.00);

	       //Set id for the Premium player
	       premiumPlayer.setID(321);            
	       premiumPlayer.setName("Thrones");
	       //Set scores to any level
	       premiumPlayer.setScore(15, 0);
	       premiumPlayer.setScore(50, 1);
	       premiumPlayer.setScore(20, 2);    
	    
	       System.out.println("PremiumSugarSmashPlayer ID: "
	               +premiumPlayer.getID());    
	       System.out.println("PremiumSugarSmashPlayer Name: "
	               +premiumPlayer.getName());    
	       System.out.println("Premium User score who pay $3");
	       System.out.println("Score : "
	               +premiumPlayer.getScore(0));
	       System.out.println("Score : "
	               +premiumPlayer.getScore(1));
	       System.out.println("Score : "
	               +premiumPlayer.getScore(2));
	   }//end of main method
	
	
	
}
	/*public static void main(String[] args) {
		SugarSmashPlayer ssPlayer = new SugarSmashPlayer();
		ssPlayer.setIdNumber(1111);
		ssPlayer.setName("Alex");
		System.out.println("\nAt start");
		display(ssPlayer);
		ssPlayer.setScore(200, 0);
		System.out.println("\nAfter setting first score");
		display(ssPlayer);
		
		System.out.println("Trying to set fifth score too soon ");
		
		ssPlayer.setScore(30, 4);
		System.out.println("\nAfter setting second score");
		display(ssPlayer);
		
		ssPlayer.setScore(30, 1);
		display(ssPlayer);
		
		System.out.println("\nTrying to set third score when second is too low");
		ssPlayer.setScore(100, 2);
		display(ssPlayer);
		
		System.out.println("\nAfter setting second, third, fourth, and fifth scores");
		ssPlayer.setScore(100, 1);
		ssPlayer.setScore(300, 2);
		ssPlayer.setScore(400, 3);
		ssPlayer.setScore(10, 4);
		display(ssPlayer);
		System.out.println("\nTrying to set eleventh score");
		ssPlayer.setScore(100, 10);
	}
	
	public static void display(SugarSmashPlayer p) {
		System.out.println(" ID # " + p.getIdNumber() + " name: " + p.getName());
		for(int x = 0; x < p.getLEVELS(); ++x) {
			System.out.print("    " + p.getScore(x));
		}
		System.out.println();		
			
		
	}

}*/
