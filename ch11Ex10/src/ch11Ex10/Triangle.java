package ch11Ex10;

public class Triangle extends GeometricFigure {
	private double area;
    public Triangle(int w, int h, String f)
    {
        // write your code here
    	super(h,w,f);
    }

    public double figureArea(int w, int h)
    {
        // write your code here
    	this.area = 0.5 * w * h;
    	return area;
    }

}
