package ch4Ex5New;



public class Game {
	
	    private Team team1;
	    private Team team2;
	    private String time;
	
		
		
   /* public Game() {
	this.team1= team1;
    this.team2 = team2;
	this.time= time;
	}*/
	    public Game(Team t1, Team t2, String time) {
	    	this.team1= t1;
	    	this.team2 = t2;
	    	this.time =  time;
	    	}	
    
	    
	    public Team getTeam1() {
	    	return team1;
	    }
	    public Team getTeam2() {
	    	return team2;
	    }
	    public String getTime() {
	    	return time;
	    }

}
