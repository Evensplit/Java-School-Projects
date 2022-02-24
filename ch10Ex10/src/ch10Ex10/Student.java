package ch10Ex10;


import java.util.Scanner;

public class Student extends Person {
   private String major;
   private double gpa;

   /*
   * Creating an Scanner class object which is used to get the inputs entered
   * by the user
   */
   Scanner input = new Scanner(System.in);

   //@Override
   public void setData() {
       super.setData();
       System.out.print("Enter Major :");
       major = input.next();
       System.out.print("Enter GPA :");
       gpa = input.nextDouble();
   }

   //
   @Override
   public void display() {
       super.display();
       System.out.print("Major :" + major);
       System.out.println(" GPA :" + gpa);

   }

}