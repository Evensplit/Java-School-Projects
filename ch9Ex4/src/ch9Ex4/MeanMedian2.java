package ch9Ex4;

import java.util.Scanner;
import java.util.*;

public class MeanMedian2 {
	
	

     public static void main(String[] args) 
      {
    	  Scanner scanner = new Scanner(System.in);
          int numbers[] = new int[20];
          int num = 0;
          int count = 0;
          double total = 0;
          String list = "You've entered: ";
          
          // code to take user numbers and store in numbers array
          // count to track the total # of integers provided
          
          for(int i = 0; i < numbers.length; i++){
              System.out.print("Enter your number (9999 to exit) " + (i + 1) + " ");
              num = scanner.nextInt();
             // num[i]=num;
              //list = list + " " + num;
              if(num==9999) {
            	 System.out.println("Thank you for playing");
            	  
            	  
            	  break;
              }
              numbers[count++] = num;
              total += num;
              list = list + ", " + num;
              
          }

          System.out.println(list );
          System.out.print("The mean is " + (total/count));

          // sort the numbers in ascending order to find the mean
          for(int i=0; i<count;i++){
              for(int j=0; j<count-1-i;j++){
                  if(numbers[j]>numbers[j+1]){
                      int temp = numbers[j];
                      numbers[j] =numbers[j+1];
                      numbers[j+1] =temp;

                  }
              }
          }
      
         //sorting complete
          
          if (count%2==1){
              System.out.println(" and the median is "+ numbers[count/2]);
          }else{
              // when there are even user numbers
              double sumMiddleTwo = numbers[count/2] + numbers[count/2-1];
              System.out.println(" and the median is "+ sumMiddleTwo/2);
          }



      }


  
    	  
      }
		  
    	  

	      
