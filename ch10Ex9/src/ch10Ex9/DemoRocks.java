package ch10Ex9;

public class DemoRocks {
	 public static void main(String[] args)
	    {
	        Rock rock = new Rock(123, 4.5);
	        
	        System.out.print("Sample # " + rock.getSampleNumber());
	        System.out.println(" weights " + rock.getWeight());
	        System.out.println("Description: " + rock.getDescription());
	        System.out.println("");

	        IgneousRock rock2 = new IgneousRock(234, 14.9);
	        
	        System.out.print("Sample # " + rock2.getSampleNumber());
	        System.out.println(" weighs " + rock2.getWeight());
	        System.out.println("Description: " + rock2.getDescription());
	        System.out.println("");
	        
	        SedimentaryRock rock3 = new SedimentaryRock(345, 18.5);
	        
	        System.out.print("Sample # "  + rock3.getSampleNumber());
	        System.out.println(" weighs " + rock3.getWeight());
	        System.out.println("Description: " + rock3.getDescription());
	        System.out.println("");
	        
	        MetamorphicRock rock4 = new MetamorphicRock(456, 7.0);
	        
	        System.out.print("Sample # " + rock4.getSampleNumber());
	        System.out.println(" weighs " + rock4.getWeight());
	        System.out.println("Description: " + rock4.getDescription());
	        System.out.println("");
	    }

}
