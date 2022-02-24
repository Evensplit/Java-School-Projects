package ch12Ex10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetIDAndAge {
	public static void main(String[] args) {
		
		
	
        int id;
        int age;
        final int QUIT = 0;
        int returnVal = QUIT + 1;
        Scanner keyboard = new Scanner(System.in);
        while (returnVal != QUIT) {
            // Write your code here
        	  System.out.print("Enter ID ");
              id = keyboard.nextInt();
              System.out.print("Enter age ");
             // age = keyboard.nextInt();

              try {
            	  age = keyboard.nextInt();
                  returnVal = check(id, age);
                  if (returnVal == -1) {
                      System.out.println("ID and Age OK.");
                     throw new InputMismatchException();
                  }
              }
             catch(InputMismatchException e){
                 	 
                 System.out.println("Input Mismatch");
                  keyboard.nextLine();

                   }

               catch (DataEntryException e) {
                  showStatus(e.getMessage());
              }
                  
                 

          }
      }
        
    
    public static int check(int idNum, int ageNum) throws DataEntryException {
        // Write your code here
    	  if (0 <= idNum && idNum <= 999) {

              if (0 <= ageNum && ageNum <= 119) {
                  if (idNum == 0 && ageNum == 0) return 0;
                  else return -1;
              } else {
                  throw new DataEntryException(ageNum);
              }
          } else {
              throw new DataEntryException(idNum);
          }
    }
    public static void showStatus(String msg) {
        // Write your code here
    	 System.out.print("Invalid Age or ID - ");
    	System.out.println(msg);
    	
    }

}
