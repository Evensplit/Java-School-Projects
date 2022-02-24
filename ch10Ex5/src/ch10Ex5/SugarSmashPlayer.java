package ch10Ex5;

public class SugarSmashPlayer {
  
	

	   //instance variables ID, screenName
	   private int IdNumber;
	   private String name;
	   //Create an array of size 10 for 10 levels
	   private int[] scores=new int[10];

	   //implement the method to set the score at gameLevel
	   public void setScore(int score, int gameLevel)
	   {
	       //Define the boolean variable
	       boolean validScores=false;
	            
	       //Set score at index=0 if gameLevel is 0
	       if(gameLevel==0)
	       {
	           scores[0]=score;
	       }        
	       else
	       {
	           //check the userscore
	           for (int index = 0; index < gameLevel
	                   && !validScores;
	                   index++)
	           {
	               if(scores[index]>100)
	               {
	                   validScores=true;
	               }                
	           }        
	           //Set score to gameLevel
	           if(validScores)
	           {
	               scores[gameLevel]=score;
	           }
	           else
	           {
	               /*Otherwise set score at index=0 and print
	               a message invalid score */
	               scores[0]=score;
	               System.out.println("Invalid score ");
	           }
	       }

	   }//end of setScore

	   //Implement method to get the Score
	   public int getScore(int gameLevel)
	   {
	       if(gameLevel>=0 && gameLevel<scores.length)
	       {
	           return scores[gameLevel];
	       }
	       else
	       {
	           System.out.println("Invalid game level");
	           return -1;
	       }    
	   }


	   //Method to set ID number
	   public void setID(int ID)
	   {
	       this.IdNumber=ID;
	   }
	   //Method to get ID number
	   public int getID()
	   {
	       return IdNumber;
	   }
	   //Set screen name
	   public void setName(String screenName)
	   {
	       this.name = screenName;
	   }
	   //Returns screen Name
	   public String getName()
	   {
	       return name;
	   }
	}//end of the SugarSmashPlayer
	
	
	
	
	
	
	

	
	/*   private int idNumber;
      private String name;
      protected int[] scores;
      private final int MINSCORE = 100;
      private int LEVELS= 10;
      
      public SugarSmashPlayer() {
    	  scores = new int[LEVELS];
      }
      
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore(int level) {
		int score = -99;
		if(level < 0 || level > scores.length - 1) {
			System.out.print(level + " is a invalid level number");
			
		}
		else {
			score = scores[level];
		}
		return score;
	}
	public void setScore(int score, int level) {
		int x;
		boolean isBadLevel = false;
		if(level < 0 || level > scores.length - 1) {
			System.out.print("*****" + level + " is a invalid level number");
			
		}
		else {
			for(x = 0; x < level; x++) {
				if(scores[x] < MINSCORE) 
					isBadLevel = true;
			}
		}
		if(isBadLevel) {
			System.out.println("***** A score cannot yet be set for level " + level);
		}
		else {
			scores[level] = score;
		}
	}
	public int getMINSCORE() {
		return MINSCORE;
	}
	public int getLEVELS() {
		return LEVELS;
	}

	
	}*/

