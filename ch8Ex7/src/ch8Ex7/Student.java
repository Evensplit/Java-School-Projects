package ch8Ex7;

public class Student {
	private int stuID;
    CollegeCourse[] course = new CollegeCourse[2];

    public int getID() {
    	return stuID;
    }
    public CollegeCourse getCourse(int x) {
    	return course[x];
    }

    public void setID(int idNum) {
    	stuID= idNum;
    }
    public void setCourse(CollegeCourse c, int x) {
    	course[x] = c;
    }

}
