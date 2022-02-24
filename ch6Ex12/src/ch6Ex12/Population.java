package ch6Ex12;

import java.util.Scanner;

public class Population {
	 public static void main(String[] args) {
         Scanner sc = new Scanner (System.in); 
             double mexicoPop = 128;
             double usPop = 323;
             int year = 0;
             int n = 0;
            
             //System.out.println("Enter the starting year : ");
            // year = sc.nextInt();
             do{
                 System.out.println("Population of Mexico in year "+ year +" is "+ mexicoPop);
                 System.out.println("Population of United State in year "+ year +" is "+ usPop);
                 System.out.println("\n");
                 
                 mexicoPop = mexicoPop * (1+ (1.01 / 100));  //Calculating the annual increase of population of Mexico
                 usPop = usPop*(1-(0.15 / 100));      //Calculating the annual decrease of population of United State
                 year++;
                 n++; //Number of years it take to exceed the population
             }while(mexicoPop < usPop);
             System.out.println("Number of years it took to exceed the popuation of Mexico from United States : "+n);
             

     }
}
