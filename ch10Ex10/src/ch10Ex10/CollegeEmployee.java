package ch10Ex10;

import java.util.Scanner;

public class CollegeEmployee extends Person {
private String ssn;
private double annualSalary;
private String dept;

/*
    * Creating an Scanner class object which is used to get the inputs entered
    * by the user
    */
    Scanner input = new Scanner(System.in);

    @Override
    public void setData() {
super.setData();
        System.out.print("Enter SSN :");
        ssn = input.next();

        System.out.print("Enter Annual Salary :");
        annualSalary = input.nextDouble();

        System.out.print("Enter Department :");
        dept = input.next();
       
    }
    @Override
    public void display() {
    	super.display();
        System.out.print("SSN :" + ssn + "Salary $" + annualSalary + "Department: "+ dept);
                System.out.print(" Salary $" + annualSalary);
                System.out.println();
        
    }
 }
    	
    

   /* @Override
    public void display() 
    {
        super.display();
        System.out.print("SSN :" + ssn);
        System.out.print(" Salary $" + annualSalary);
        System.out.println(" Department :" + dept);
    }
}*/
