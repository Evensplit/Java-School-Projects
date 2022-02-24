package ch3Ex12;

/*public class Student {
	
	private int studentID;
	private int creditHours;
	private int numOfPoints;
	int idNumber;
	int points;
	int hours;
	
	double gpa;
	
	Student(){
	 idNumber = 9000;
	  points = 12;
	  hours = 3;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int number) {
		this.studentID =  number;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public int getNumOfPoints() {
		return numOfPoints;
	}
	public void setNumOfPoints(int numOfPoints) {
		this.numOfPoints = numOfPoints;
	}
	public double getGradePoint() {
	//double gpa = (double) numOfPoints / creditHours;
	
		return (double)numOfPoints / creditHours;
	}
    
	public void displayStudentID() {
		System.out.println("Student ID: " + studentID);
	}

	public void displayCreditHours() {
		System.out.println("Student credit hours: " + creditHours);
	}

	public void displayNumOfPoints() {
		System.out.println("Student grade points: " + numOfPoints);
	}

	public void displayIDnumber() {
		System.out.println("Student ID: " + idNumber);
		
	}

	public void displayPoints() {
		System.out.println("Student grade points: " + points);
		
	}

	public void displayHours() {
		
		System.out.println("Student credit hours: " + hours);
	}

	public double getGradePoint2() {
		return(points / hours);
	
	}
	
		
	
}*/
public class Student {
	
	private int idNumber;
	private int hours;
	private int points;
	int idNumber1;
	int points1;
	int hours1;
	
	double gpa;
	
	Student(){
	 idNumber = 9000;
	  points = 12;
	  hours = 3;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getIdNumber1() {
		return idNumber1;
	}

	public void setIdNumber1(int idNumber1) {
		this.idNumber1 = idNumber1;
	}

	public int getPoints1() {
		return points1;
	}

	public void setPoints1(int points1) {
		this.points1 = points1;
	}

	public int getHours1() {
		return hours1;
	}

	public void setHours1(int hours1) {
		this.hours1 = hours1;
	}

	//public void setStudentID(int i) {
		// TODO Auto-generated method stub
		
	

	public void showStudentID() {
		System.out.println("Student ID: " + idNumber);
		
	}

	public void showPoints() {
		System.out.println("Student grade points: " + points);
		
	}

	public void showHours() {

		System.out.println("Student credit hours: " + hours);
		
	}

	public double getGradePoint() {
		return (double)points / hours;
		
	}

	public double getGradePoint2() {
		return(points / hours);
		
	}

	public void showIdNumber() {
		System.out.println("Student ID: " + idNumber);
		
	}
}
	/*public int getStudentID() {
		return idNumber;
	}
	public void setStudentID(int number) {
		this.idNumber =  number;
	}
	public int getCreditHours() {
		return hours;
	}
	public void setCreditHours(int creditHours) {
		this.hours = creditHours;
	}
	public int getNumOfPoints() {
		return points;
	}
	public void setNumOfPoints(int numOfPoints) {
		this.points = numOfPoints;
	}
	public double getGradePoint() {
	//double gpa = (double) numOfPoints / creditHours;
	
		return (double)points / hours;
	}
    
	public void displayStudentID() {
		System.out.println("Student ID: " + idNumber);
	}

	public void displayCreditHours() {
		System.out.println("Student credit hours: " + hours);
	}

	public void displayNumOfPoints() {
		System.out.println("Student grade points: " + points);
	}

	public void displayIDnumber() {
		System.out.println("Student ID: " + idNumber);
		
	}

	public void displayPoints() {
		System.out.println("Student grade points: " + points);
		
	}

	public void displayHours() {
		
		System.out.println("Student credit hours: " + hours);
	}

	public double getGradePoint2() {
		return(points / hours);
	
	}
	
		
	
}*/
