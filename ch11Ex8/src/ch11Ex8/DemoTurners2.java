package ch11Ex8;

public class DemoTurners2 {
	 public static void main(String[] args)
	   {   
		//initializing new classes
		    Leaf aLeaf = new Leaf();
		    Page aPage = new Page();
		    Pancake aCake = new Pancake();
		    
		  //initializing new classes
		    Wheel aWheel = new Wheel();
		    Fan aFan = new Fan();
		    Milk aMilk = new Milk();

		   //calling turn methods from classes
		    aWheel.turn();
		    aFan.turn();
		    aMilk.turn();
			
		    
		    //calling turn methods from classes
		    aLeaf.turn();
		    aPage.turn();
		    aCake.turn();
	      
	   }

}
