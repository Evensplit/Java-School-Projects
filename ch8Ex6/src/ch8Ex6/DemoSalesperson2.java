package ch8Ex6;

public class DemoSalesperson2 {

	public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[10];
        int assignId = 111;
        int assignSales = 25000;
        final int SALES_INCREASE = 5000;

		
		for(int i = 0; i < salesPeople.length; i++) {
			salesPeople[i] = new SalesPerson(assignId, assignSales);
			  assignId++;
			  assignSales += SALES_INCREASE;
		}
		for(int i = 0; i < salesPeople.length; i++) {
			System.out.println("Salesprson "+ i + " has ID# " + salesPeople[i].getId() + 
					" and annual sales of $" + salesPeople[i].getSales());

	}

}
}