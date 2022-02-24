package ch6Ex11;

public class DrugTests {
	public static void main(String[]args) {
	
	int factory;
	int numOfWeeks = 52;
	int insOfFactory1 = 0;
	int insOfFactory2 = 0;
	int insOfFactory3 = 0;
	int insOfFactory4 = 0;
	
	//interate over weeks to select # of random weeks
	//for 52 week and count the selected factories in each switch case
	
	for(int week = 1; week <= numOfWeeks; week++) {
		factory = 1 + (int)(Math.random() * 4);     //generate random # between 1 and 4 (inclusive)
		
		
		
		switch(factory) {               //switch statement to select appropriate factory based on random
		                                // generated number and increment the count of factory
		case 1:
			insOfFactory1++;
		break;
		
		case 2:
			insOfFactory2++;
		break;
		
		case 3:
			insOfFactory3++;
		break;
		
		case 4:
			insOfFactory4++;
		break;
		}
		// print selected factory
		System.out.println("Week: " + week + " factory selected : " + factory);
	}
	//print percentage of selection of all factories
	System.out.println("Percentage of factory 1: " + ((double) insOfFactory1 / numOfWeeks) * 100);
	//factory 2
	System.out.println("Percentage of factory 2: " + ((double) insOfFactory2 / numOfWeeks) * 100);
    //factory 3
	System.out.println("Percentage of factory 3: " + ((double) insOfFactory3 / numOfWeeks) * 100);
    //factory 4
	System.out.println("Percentage of factory 4: " + ((double) insOfFactory4 / numOfWeeks) * 100);


	}

	
	
	
	
	
	
	
}
