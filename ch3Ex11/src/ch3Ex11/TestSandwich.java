package ch3Ex11;

public class TestSandwich {

	public static void main(String[] args) {
		
		Sandwich firstSandwich = new Sandwich();
		firstSandwich.setBreadType("whole wheat");
		firstSandwich.setMainIngredient("Roast beef");
		firstSandwich.setPrice(9.99);
		
		System.out.println("you orderd " + firstSandwich.getMainIngredient()
		                 + " on " + firstSandwich.getBreadType() + " which costs " 
		                 + firstSandwich.getPrice());
		

	}

}
