package ch4Ex6;

public class Circle {
	//data fields
	 private double radius;
	    private double area;
	    private double diameter;
	    
	    //constructor initializes data fields
	    Circle() {
	    	radius = 1;
	    	diameter = radius / 2;
	    	area = Math.PI * radius * radius;
	    }
	    public void setRadius(double r) {
	    	radius = r;
	    	diameter = radius * 2;
	    	area = Math.PI * radius * radius;
	    }
	    public double getRadius() {
	    	return radius;
	    }
	    private void computeDiameter() {
	    	diameter = radius * 2;
	    	//System.out.println(" the diameter is " + diameter);
	    }
	    private void computeArea() {
	    	area = 3.14 * radius * radius;
	    	//System.out.println(" the area is " + area);
	    }
	    public double getDiameter() {
	    	return diameter;
	    }
	    public double getArea() {
	    	return area;
	    }

}
