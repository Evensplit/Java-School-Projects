package ch10Ex8;

import java.util.*;
public class LabCourse extends CollegeCourse{
	// attributes
	private double courseFee;
	// constructor
	public LabCourse(String dept, int id, double credits, double courseFee){
	super(dept, id, credits);
	this.courseFee = courseFee;
	}
	// override display()
	public void display(){
	System.out.println(dept+id+"\nLab course\n"+credits+" credits");
	System.out.println("Lab fee is $"+courseFee);
	System.out.println("Total fee is $"+((credits*120)+courseFee));
	}
	}
/*public class LabCourse extends CollegeCourse{

    // attributes

    private double price;

    // constructor

    public LabCourse(String dept, int id, double credits, double price){

        super(dept, id, credits);

        this.price = price;

    }

    // override display()

    public void display(){

        System.out.println(dept+id+"\nLab course\n"+credits+" credits");

        System.out.println("Lab fee is $" + price);

        System.out.println("Total fee is $"+((credits * 120) + price));

    }

}*/