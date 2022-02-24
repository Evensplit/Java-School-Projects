package ch6Ex4;

import java.util.Scanner;

public class InBetween {
	  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int x , y ;
     System.out.println("Enter an integer : ");
     x = sc.nextInt();
     System.out.println("Enter an integer : ");
     y = sc.nextInt();
  
    
    
     if(x > y) {
    	
         int temp = x;
         x = y ;
         y = temp ;
         
         
     }
   
    		
     boolean flag = true ;
    
     for(int i = x+1; i < y; i++) {
    	 System.out.print(" the numbers between " + x + " and " + y + " include: ");
         flag = false ;
         
         System.out.print( i + " ");
         
     }
     if(flag) {
         System.out.printf("There are no integers between %d and %d\n", x, y);
     }
		  
		  
		 /* int X,Y;
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter first integer : ");
		  X = input.nextInt();
		  
		  System.out.println("Enter second integer : ");
		  Y = input.nextInt();
		  
		  if(X >= Y || X == Y + 1) {
		  System.out.println("There are no integers between X and Y");
		  }
		  else 
		  {
		  while( X <= Y )
		  {
		  System.out.print( X + " ");
		  X += 1;
		  }
		  }*/
		  }

}
