package ch11Ex10;

public abstract class GeometricFigure {
	// write your code here
	   private int height;
	   private int width;
	   private String figure;
	   
    public GeometricFigure(int h, int w, String f)
    {
        // write your code here
    	this.height = h;
    	this.width = w;
    	this.figure = f;
    }
    public int getHeight()
    {
        // write your code here
    	return height;
    }
    public int getWidth()
    {
        // write your code here
    	return width;
    	
    }
    public String getFigure()
    {
        // write your code here
    	return figure;
    }
    public abstract double figureArea(int h, int w);
}

