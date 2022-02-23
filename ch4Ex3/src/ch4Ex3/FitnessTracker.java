package ch4Ex3;
import java.time.*;
public class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;
    // constructor for 3a
    public FitnessTracker() {
           activity = "running";
	    	minutes = 0;
	    	date = LocalDate.of(2021, 01, 01);
    }
    // constructor for 3b
    public FitnessTracker(String a, int m, LocalDate d){
            this.activity = a;
	    	this.minutes = m;
	    	this.date = d;
     
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

    public void setActivity(String activity) {
	    	this.activity =activity;
	    }

    public void setMinutes(int minutes) {
	    	this.minutes = minutes;
	    }
     public void setDate(LocalDate date) {
	    	this.date = date;
	    }
}

/*import java.time.*;
public class FitnessTracker {

	    private String activity;
	    private int minutes;
	    private LocalDate date;
		
	    // constructor for 3a
	    public FitnessTracker() {
	    	activity = "running";
	    	minutes = 0;
	    	date = LocalDate.of(2021, 01, 01);
	    }
	    // constructor for 3b
	    public FitnessTracker(String a, int m, LocalDate d) {
	    	activity = a;
	    	minutes = m;
	    	date = d;
	    }
	    public String getActivity() {
			return activity;
	    }
	    
	    public void setActivity(String activity) {
	    	this.activity =activity;
	    }
	    public int getMinutes() {
			return minutes;
	    }
	    
	    public void setMinutes(int minutes) {
	    	this.minutes = minutes;
	    }
	    public LocalDate getDate() {
	     	return date;
	
	    }
	    
	    public void setDate(LocalDate date) {
	    	this.date = date;
	    }
}
*/



