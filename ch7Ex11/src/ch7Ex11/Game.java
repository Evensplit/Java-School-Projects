package ch7Ex11;

public class Game {
	
	    private Team team1;
	    private Team team2;
	    private String time;
	    
	    public Game(Team t1, Team t2, String time) {
	        // your code here
	    	this.team1 = t1;
	    	this.team2 = t2;
	    	this.time = time;
	    	if(!t1.getSport().equals(t2.getSport())) {
	    		time = "Game Cancelled!";
	    	}
	    		this.time = time;
	    	
	    }
	    public Team getTeam1() {
	        // your code here
	    	return team1;
	    }
	    public Team getTeam2() {
	        // your code here
	    	return team2;
	    }
	    public String getTime() {
	        // your code here
	    	return time;
	    }
	   
	}


