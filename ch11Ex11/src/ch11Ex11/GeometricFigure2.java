package ch11Ex11;

public abstract class GeometricFigure2 {
	
	protected int height;
    protected int width;
    protected String figure;

    public  GeometricFigure2(int h, int w, String f)
    {
        // write your code here
    	this.height = h;
    	this.width = w;
    	this.figure = f;
    }

    public int getHeight()
    {
		return height;
        // write your code here
    	
    }

    public int getWidth()
    {
		return width;
        // write your code here
    }

    public String getFigure()
    {
		return figure;
        // write your code here
    }

    public abstract double figureArea(int h, int w);

	protected abstract void displaySides();

		
	}

	


