package ch12Ex6;

public class Course {
	
	String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    public Course() {
        // Write your code here
    	department = null;
    	courseNumber = 0;
    	credits = 0;
    }
    public Course(String dept, int num, double creditValue) throws CourseException {
        // Write your code here
    	  if (dept.length() != 3)
    	         throw new CourseException("Department length should be 3");

    	        if (num < LOW_NUM || num > HIGH_NUM)
    	            throw new CourseException("course number does not consist of three digits between 100 and 499 inclusive");
    	        if (creditValue < LOW_CREDITS || creditValue > HIGH_CREDITS)
    	            throw new CourseException("credit values must be in range (0.5 and 6)");

    	        this.department = dept;
    	        this.courseNumber = num;
    	        this.credits = creditValue;
    }
    @Override
    public String toString() {
        // Write your code here
    	 return "Course{" +
         "department='" + department + '\'' +
         ", courseNumber=" + courseNumber +
         ", credits=" + credits +
         '}';
   }
}


