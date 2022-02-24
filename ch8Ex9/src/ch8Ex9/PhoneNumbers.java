package ch8Ex9;

import java.util.Scanner;

public class PhoneNumbers {

	public static void main(String[] args) {
		String[] nameList = new String [30];
		String[] numberList = new String[30];
		nameList[0] = "Gina";
		numberList[0] = "(847) 341-0912";
		nameList[1] = "Marica";
		numberList[1] = "(847) 341-2392";
		nameList[2] = "Rita";
		numberList[2] = "(847) 354-0654";
		nameList[3] = "Jennifer";
		numberList[3] = "(414) 234-0912";
		nameList[4] = "Fred";
		numberList[4] = "(414) 435-6567";
		nameList[5] = "Neil";
		numberList[5] = "(608) 123-0904";
		nameList[6] = "Judy";
		numberList[6] = "(608) 435-0434";
		nameList[7] = "Arlene";
		numberList[7] = "(608) 123-0312";
		nameList[8] = "LaWanda";
		numberList[8] = "(920) 787-9813";
		nameList[9] = "Deepak";
		numberList[9] = "(930) 412-0991";
		int size = 10;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter name to look up.  Type 'quit' to quit");
			name = scanner.nextLine();
			if(name.equals("quit")) {
				break;
			}
			if(inPhoneBook(name, nameList)) {
				String temp = returnNumber(name, nameList, numberList, size);
				System.out.println(name + "'s phone number is " + temp);
			}
			else{
				System.out.println(" Enter phone number for " + name + " " );
				String tempNum = scanner.nextLine();
				nameList[size] = name;
				numberList[size] = tempNum;
				size++;
			}
			if(size == 20) {
				break;
			}
		}

	}
	public static Boolean inPhoneBook(String name, String[] nameList) {
		Boolean inList = false;
		for(String x : nameList) {
			if(name.equals(x)) {
				inList = true;
			}
		}
		return inList;
		
	}  
      public static String returnNumber(String name, String[] nameList,  String[]numberList, int currentSize) {
		String toReturn = " ";
    	  for(int x = 0; x<= currentSize; x++) {
    		  if(name.equals(nameList[x])) {
    			  toReturn = numberList[x];
    			  
    		  }
    		 
    	  }
    	  return toReturn;
      }
}
