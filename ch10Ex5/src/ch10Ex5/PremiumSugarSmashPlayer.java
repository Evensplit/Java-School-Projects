package ch10Ex5;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
	
	//instance variables
	   private int[] scores=new int[40];
	   private boolean accessLevel;
	   //Constructor that sets pay value
	   public PremiumSugarSmashPlayer(double pay)
	   {    
	       //Check if pay is pay $2.99 to access all levels
	       if(pay>=2.99)
	       {
	           accessLevel=true;
	       }
	       else
	       {
	           //Otherwise set accesLevel to false
	           accessLevel=false;
	       }
	   }

	   //implement the mutator method to set the score
	   public void setScore(int score, int gameLevel)
	   {
	       //Check if user has accessLevel
	       if(accessLevel)
	       {
	           if(gameLevel<0 ||gameLevel>scores.length)
	           {
	               System.out.println("Invalid Game level");
	           }
	           else
	           {
	               scores[gameLevel]=score;
	           }    
	       }
	       else
	       {
	           System.out.println("Pay 2.99 to access levels:\n");
	       }
	   }
	   //Returns score at given game level
	   public int getScore(int gameLevel)
	   {
	       if(gameLevel>=0 && gameLevel<scores.length )
	       {
	           return scores[gameLevel];
	       }
	       else
	       {
	           System.out.println("Invalid Game Level");
	           return -1;
	       }    
	   }
	
	
	
	
	
	
	
}

	/*private int LEVELS = 50;
	public PremiumSugarSmashPlayer() {
		scores = new int[LEVELS];
	}
	
	public int getLevels() {
		return LEVELS;
	}
}*/
