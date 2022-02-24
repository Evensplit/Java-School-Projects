package ch12Ex1;

import java.util.*;
public class BadSubscriptCaught
{
   public static void main(String[] args)
   {
      String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
        "Fred", "Gina", "Henry"};
      Scanner keyboard = new Scanner(System.in);
      int number;
     
      // your code here
      try
      {
          System.out.println("Enter an number and I will display a name ");
          number = keyboard.nextInt();
          System.out.println("The name is "+ names[number]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Subscript out of range ");
      }
   }
}