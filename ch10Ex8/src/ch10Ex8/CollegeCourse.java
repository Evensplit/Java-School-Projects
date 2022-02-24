package ch10Ex8;

import java.util.*;

public class CollegeCourse {
	// attributes
	String dept;
	int id;
	double credits;
	double price;
	// constructor
	public CollegeCourse(String dept, int id, double credits){
	this.dept = dept;
	this.id = id;
	this.credits = credits;
	}
	// display()
	public void display(){
	System.out.println(dept+id+"\nNon-lab course\n"+credits+" credits");
	System.out.println("Total fee is $"+credits*120);
	}
	}


/*public class CollegeCourse {

    // attributes

    String dept;

    int id;

    double credits;

    double price;

    // constructor

    public CollegeCourse(String dept, int id, double credits){

        this.dept = dept;

        this.id = id;

        this.credits = credits;

    }

    // display()

    public void display(){

        System.out.println(dept+id+"\nNon-lab course\n"+credits+" credits");

        System.out.println("Total fee is $"+ credits * 120);

    }

}*/