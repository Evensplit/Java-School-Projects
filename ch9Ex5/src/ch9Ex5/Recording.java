package ch9Ex5;


	
	public class Recording {
	    private String song;
	    private String artist;
	    private int playTime;
	    
	    /*  Setter for attributes/variables */
	    public void setSong(String title) {
	        song = title;
	    } 

	    public void setArtist(String name) {
	        artist = name;
	    }
	    
	    public void setPlayTime(int time) {
	        playTime = time;
	    }
	    /*  Getter for attributes/variables */
	    public String getSong() {
	        return song;
	    }
	    
	    public String getArtist() {
	        return artist;
	    }
	    
	    public int getPlayTime() {
	        return playTime;
	    }

	    /* To print all attributes */
	    @Override
	        public String toString() {
	                return "Recording [song=" + song + ", artist=" + artist + ", playTime=" + playTime + "]";
	        }
	    
	}


