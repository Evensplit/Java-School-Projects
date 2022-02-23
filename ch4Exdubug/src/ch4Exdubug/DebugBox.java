package ch4Exdubug;

public class DebugBox {
	
	private int width;
	   private int length;
	   private int height;
	   public DebugBox()
	   {
	      length = 1;
	      width = 1;
	      height = 1;
	   }
	   public DebugBox(int width, int length, int height)
	   {
	      this.width = width;
	      this.length = length;
	      this.height = height;
	   }
	   public void showData()
	   {
	      System.out.println("Width: "  + width + " Length: " +
	        length + "  Height: " + height);
	   }
	   public double getVolume()
	   { 
	      double vol = length * width * height;
	      return vol;
	   }
	}

	

		
		
		
		
		
		
		
		//chapter 4 degugging exercise 2
		/* double radius = 12.6;
	      System.out.println("Circle statistics");
	      double area = Math.PI * radius * radius;
	      System.out.println("area is " + area);
	      double diameter = 2 - radius;
	      System.out.println("diameter is " + diameter);
	   }*/
	




    // chapter 4 degugging exercise 1
	/*public static void main(String args[])
	   {
	      int x = 5;
	      int y = 8;
	      System.out.println("adding " + x + y);

	      int z = 19;
	      System.out.println("subtracting "  +( z - y));

	      System.out.println("dividing " + z / x);
	      System.out.println("multiplying " + x * z);
	   }*/

