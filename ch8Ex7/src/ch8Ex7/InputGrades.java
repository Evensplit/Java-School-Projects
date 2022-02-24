package ch8Ex7;

import java.util.Scanner;

public class InputGrades {
public static void main(String[]args) {
	
	Student[] listOfStudents = new Student[2];
	
   Scanner input = new Scanner(System.in);

    for(int x = 0; x < listOfStudents.length; x++) {
    	System.out.print("Enter ID for student # " + (x + 1) + ">> ");
    	int id = input.nextInt();
    	input.nextLine();
    	Student stu = new Student();
    	stu.setID(id);
    	
    	for(int y = 0; y < 5; y++) {
    		CollegeCourse temp = new CollegeCourse();
    		System.out.print("enter course ID # " + (y +1) + ">>");
    		String id2 = input.nextLine();
    		temp.setID(id2);
    		System.out.print("Enter credits for this course >> ");
    		int creditVal = input.nextInt();
    		input.nextLine();
    		temp.setCredits(creditVal);
    		boolean isGoodGrade = false;
    		while(!isGoodGrade){
    			System.out.print("Enter Grade for this course >> ");
    			String gradeStr = input.nextLine();
    			char grade = gradeStr.charAt(0);
    			if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
    				isGoodGrade = true;
    				temp.setGrade(grade);
    			}
    			
    			
    		}
    		stu.setCourse(temp, y);
    	}
    	 
		listOfStudents[x] = stu;
    	 
    	
    	}
        for(int x = 0; x < listOfStudents.length; x++) {
        	Student stu = listOfStudents[x];
        	System.out.println("Student # " + (x + 1) + " ID # " + stu.getID());
        	for(int y = 0; y < 5; y++) {
        		CollegeCourse temp = stu.getCourse(y);
        		System.out.println(temp.getID() + " " + temp.getCredits() + "-- credits Grade is " + temp.getGrade());
        	}
        }
        
        
    }
}