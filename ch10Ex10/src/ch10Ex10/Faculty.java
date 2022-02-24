package ch10Ex10;

import java.util.Scanner;

public class Faculty extends CollegeEmployee {
   private boolean isTenured = false;
   //isTenured = "yes";
   /*
   * Creating an Scanner class object which is used to get the inputs entered
   * by the user
   */
   Scanner input = new Scanner(System.in);

   @Override
   public void setData() {
       super.setData();
       System.out.print("Is Tenured (True or False):");
       isTenured = input.nextBoolean();
      

   }

   public void display() {
	   super.display();
	   if(isTenured) {
		   System.out.println("Faculty member is tenured");
		      System.out.println();
	   }
	   else {
		   System.out.println("Faculty member is not tenured");
		      System.out.println();
	   }
   }
}
   //@Override
   /*public void display() {
       super.display();
       if(isTenured)
       System.out.println("Faculty memeber is tenured.");
       else
       System.out.println("Faculty memeber is not tenured.");      
   }
}*/