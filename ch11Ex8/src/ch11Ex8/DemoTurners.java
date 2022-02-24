package ch11Ex8;

public class DemoTurners {

	public static void main(String [] args) {
   
    
  //initializing new classes
    Wheel aWheel = new Wheel();
    Fan aFan = new Fan();
    Milk aMilk = new Milk();

   //calling turn methods from classes
    aWheel.turn();
    aFan.turn();
    aMilk.turn();
	
	}
}
