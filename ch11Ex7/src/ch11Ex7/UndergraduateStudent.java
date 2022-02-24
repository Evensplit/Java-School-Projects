package ch11Ex7;

public class UndergraduateStudent extends Student{
	public static final double UNDERGRAD_TUITION = 4000;

	public UndergraduateStudent(String id, String name) {

	// write your code here

	super(id, name);

	setTuition();

	}

	public void setTuition() {

	tuition = UNDERGRAD_TUITION;

	}

}
