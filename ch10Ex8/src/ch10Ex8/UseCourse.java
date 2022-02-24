package ch10Ex8;

import java.util.*;
public class UseCourse {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String dept, inStr;

String[] labCourses = { "BIO", "CHM", "CIS", "PHY" };

int id, credits;

int found = 0;

int x;

// your code here

System.out.print("Enter course: ");

inStr = input.next();

System.out.print("Enter id: ");

id = input.nextInt();

System.out.print("Enter credits: ");

credits = input.nextInt();

for(int i=0; i<labCourses.length; i++){

if(inStr.equalsIgnoreCase(labCourses[i])){

found = 1;

break;

}

}

if(found==1){

LabCourse labCourse = new LabCourse(inStr, id, credits, 50);

labCourse.display();

}

else{

CollegeCourse collegeCourse = new CollegeCourse(inStr, id, credits);

collegeCourse.display();

}

}

}
	
/*public class UseCourse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String dept, inStr;
        

        String[] labCourse = { "BIO", "CHM", "CIS", "PHY" };

        int id, credits;

        int found = 0;

        int x;

        System.out.print("Enter course: ");

        inStr = input.next();

        System.out.print("Enter id: ");

        id = input.nextInt();

        System.out.print("Enter credits: ");

        credits = input.nextInt();

        for(int i = 0; i < labCourse.length; i++){

            if(inStr.equalsIgnoreCase(labCourse[i])){

                found = 1;

                break;

            }

        }

        if(found==1){

            LabCourse labCourses = new LabCourse(inStr, id, credits, 50);

            labCourses.display();

        }

        else{

            CollegeCourse collegeCourse = new CollegeCourse(inStr, id, credits);

            collegeCourse.display();

        }

    }

}*/