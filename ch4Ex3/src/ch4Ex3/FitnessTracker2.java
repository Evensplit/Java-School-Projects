package ch4Ex3;
import java.time.*;
public class FitnessTracker2 {
	
	    String activity;
	    int minutes;
	    LocalDate date;
	    
	    public FitnessTracker2() {
	    	this("Running", 0, LocalDate.of(2021,01,01));
	    	
	    }
	    public FitnessTracker2(String activityParam, int minutesParam, LocalDate dateParam) {
	    	this.activity = activityParam;
	    	this.minutes = minutesParam;
	    	this.date = dateParam;
	    }
	    public String getActivity() {
			return activity;
	    }
	    public int getMinutes() {
			return minutes;
	    }
	    public LocalDate getDate() {
			return date;
	    }
		public void setActivity(String a) {
			this.activity = a;
		 
			
		}
		public void setMinutes(int m) {
			this.minutes = m;

		}
		public void setDate(LocalDate now) {
			this.date = now;
			
		}
	}


