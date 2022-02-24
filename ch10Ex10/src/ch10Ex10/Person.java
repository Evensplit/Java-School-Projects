package ch10Ex10;

import java.util.Scanner;

public class Person {
   private String firstName;
   private String lastName;
   private String address;
   private String zip;
   private String phone;

   /*
   * Creating an Scanner class object which is used to get the inputs entered
   * by the user
   */
   Scanner input = new Scanner(System.in);

   public void setData() {

       System.out.print("Enter first name :");
       firstName = input.next();

       System.out.print("Enter last name :");
       lastName = input.next();

       input.nextLine();
      
       System.out.print("Enter address :");
       address = input.nextLine();

       System.out.print("Enter zip :");
       zip = input.next();

       System.out.print("Enter phone :");
       phone = input.next();

   }

   public void display() {
       System.out.println(firstName+" "+lastName+" "+address+" "+zip+" "+phone);
   }

}