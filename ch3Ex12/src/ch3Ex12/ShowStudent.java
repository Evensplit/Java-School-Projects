package ch3Ex12;

/*public class ShowStudent {

	public static void main(String[] args) {
		Student pupil = new Student();
		pupil.setStudentID(20);
		pupil.setNumOfPoints(47);
		pupil.setCreditHours(15);
		
		pupil.displayStudentID();
		pupil.displayNumOfPoints();
		pupil.displayCreditHours();
		
		System.out.println("GPA = " + pupil.getGradePoint());
	}

}*/
public class ShowStudent {

	public static void main(String[] args) {
		Student pupil = new Student();
		pupil.setIdNumber(20);
		pupil.setPoints(47);
		pupil.setHours(15);
		
		pupil.showIdNumber();
		pupil.showPoints();
		pupil.showHours();
		
		System.out.println("GPA = " + pupil.getGradePoint());
	}

}
