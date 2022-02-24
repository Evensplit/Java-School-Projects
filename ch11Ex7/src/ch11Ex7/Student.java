package ch11Ex7;

public abstract class Student {
	
	private String id;

	private String lastName;

	protected double tuition;

	public Student(String id, String name) {

	// write your code here

	this.id = id;

	this.lastName = name;

	}

	public void setId(String idNum) {

	// write your code here

	this.id = idNum;

	}

	public void setLastName(String name) {

	// write your code here

	this.lastName = name;

	}

	public String getId() {

	// write your code here

	return id;

	}

	public String getLastName() {

	// write your code here

	return lastName;

	}

	public double getTuition() {

	// write your code here

	return tuition;

	}

	public abstract void setTuition();
}
