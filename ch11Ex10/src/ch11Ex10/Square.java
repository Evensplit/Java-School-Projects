package ch11Ex10;

public class Square extends GeometricFigure {

    private double area;
    public Square(int w, int h, String f)
    {
        // write your code here
    	super(h,w,f);
    }

    public double figureArea(int w, int h)
    {
         this.area = w * h;
         return area;
    
    
    }

}
