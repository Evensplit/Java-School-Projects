package ch8Ex6;

public class DemoSalesperson {

	public static void main(String[] args) {
		SalesPerson[] salesPeople = new SalesPerson[10];
		
		for(int i = 0; i < salesPeople.length; i++) {
			salesPeople[i] = new SalesPerson(9999, 0);
		}
		for(int i = 0; i < salesPeople.length; i++) {
			System.out.println("Salesprson "+ i + " has ID# " + salesPeople[i].getId() + 
					" and annual sales of $" + salesPeople[i].getSales());
			
		}

	}

}
