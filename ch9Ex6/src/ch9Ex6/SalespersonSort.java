package ch9Ex6;
import java.util.*;
import java.util.Scanner;

public class SalespersonSort {

	   public static void main(String[] args) {
	       Salesperson salesPrsn[]=new Salesperson[7];
	       Scanner scnr=new Scanner(System.in);
	       int id;
	       double sales;
	       char choice;
	       for(int i=0;i<salesPrsn.length;i++)
	       {
	           System.out.println("Enter ID number ");
	           id=scnr.nextInt();
	           System.out.print("Enter sales value ");
	           sales=scnr.nextDouble();
	           salesPrsn[i]=new Salesperson(id, sales);
	       }
	       System.out.println("By which field do you want to sort?\n (I)D number or (S)ales ");
	      //choice entered either I or S
	       choice=scnr.next().charAt(0);
	       if(choice=='I' || choice=='i')
	       {
	           sortByID(salesPrsn);//sort by Id
	       }
	       else if(choice=='s' || choice=='S')
	       {
	           sortBySales(salesPrsn);//sort by sales
	       }
	       System.out.println("ID\tSales");
	       for(int i=0;i<salesPrsn.length;i++)
	       {
	           System.out.println("ID: " + salesPrsn[i].getId() + " sales: " + salesPrsn[i].getSales());
	       }
	   }

	   private static void sortBySales(Salesperson[] salesPrsn) {
	       Salesperson temp;
	       for(int i=0;i<salesPrsn.length-1;i++)
	       {
	           for(int j=i;j<salesPrsn.length;j++)
	               if(salesPrsn[i].getSales()>salesPrsn[j].getSales())
	               {
	                   temp=salesPrsn[i];
	                   salesPrsn[i]=salesPrsn[j];
	                   salesPrsn[j]=temp;
	               }
	       }
	   }

	   private static void sortByID(Salesperson[] salesPrsn) {
	       Salesperson temp;
	       for(int i=0;i<salesPrsn.length-1;i++)
	       {
	           for(int j=i;j<salesPrsn.length;j++)
	               if(salesPrsn[i].getId()>salesPrsn[j].getId())
	               {
	                   temp=salesPrsn[i];
	                   salesPrsn[i]=salesPrsn[j];
	                   salesPrsn[j]=temp;
	               }
	       }
	      
	   }

}










/*public class SalespersonSort {
	
	public static void main(String[] args) {
	      
	       Scanner scanner = new Scanner(System.in);
	       //creating Salesperson array of 7 objects
	       Salesperson s1[]=new Salesperson[7];
	      
	       double value;
	       String id;
	       boolean flag=true;
	      
	       //requesting value of 7 salesperson
	       for(int i=0; i < s1.length; i++) {
	           System.out.println("Enter ID number ");
	           id = scanner.nextLine();
	           System.out.println("Enter sales value ");
	           value=Double.parseDouble(scanner.nextLine());
	           s1[i] = new Salesperson(id,value);
	       }

	       //repeat until user enter quit
	       while(flag) {
	           System.out.println("By which field do you want to sort?\n(I)d number or (S)ales");
	           char ch = scanner.next().charAt(0);
	           if(ch=='I') {
	               sortId(s1);
	           }else if(ch=='S') {
	               sortSales(s1);
	           }else if(ch=='Q'){
	               flag=false;
	               System.out.println("Exiting........");
	           }else {
	               System.out.println("Invalid choice.....Please re-enter");
	           }
	           System.out.println();
	       }
	       }
	
	 
	   //function to display the id and value of salesperson
	   public static void display(Salesperson s[]) {
	       for(int i=0; i < 7;i++) {
	           System.out.println(s[i]);
	       }
	   }
	  
	   //function to sort the sales person by id
	   public static void sortId(Salesperson s[]) {
	       int n=7;
	       for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (s[j].getId().compareTo(s[j+1].getId()) > 0)
	                {
	                    //swap the objects
	                    Salesperson temp = s[j];
	                    s[j] = s[j + 1];
	                    s[j + 1] = temp;
	                }
	            }
	       }
	       display(s);  
	   }
	  
	   //function to sort the sales person by sales amount
	   public static void sortSales(Salesperson s[]) {
	       int n=7;
	       for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (s[j].getSales()>s[j +1 ].getSales())
	                {
	                    //swap the objects
	                    Salesperson temp = s[j];
	                    s[j] = s[j+1];
	                    s[j+1] = temp;
	                }
	            }
	       }
	       display(s);
	   
	  
	  
	      
	      
	   }

	}*/


