package ch11Ex7;

public class StudentAtLarge extends Student{
	
	public static final double SAL_TUITION = 2000;

	public StudentAtLarge(String id, String name) {

	// write your code here

	super(id, name);

	setTuition();

	}

	public void setTuition() {

	tuition = SAL_TUITION;

	}

}
