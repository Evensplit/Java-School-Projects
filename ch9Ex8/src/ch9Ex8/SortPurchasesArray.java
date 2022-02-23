package ch9Ex8;

import java.util.*;
import java.util.Scanner;

public class SortPurchasesArray {
	 public static void main(String[] args) {

	        Purchase[] purchases = new Purchase[5]; //initialize purchases array
	        boolean run = true;

	        Scanner scanner = new Scanner(System.in);
	        //read 5 purchase data from user
	        for(int i = 0; i < purchases.length; i++){ 
	            System.out.print("Enter invoice number >> " );
	            int invNum = scanner.nextInt();
	             System.out.print("Enter sales amount >> "); //( i + 1)adds increment to invoice number entered
	             Double sAmt = scanner.nextDouble(); //read sales amount
	            
	            Purchase purchase = new Purchase(); //create purchase object
	            
	            purchase.setInvoiceNumber(invNum);
	            
	            purchase.setSaleAmount(sAmt);
	            purchases[i] = purchase;    //add the object to array
	        }
	       
	        
	       
       while(run) {
    	   System.out.println("Sort purchases by (I)nvoice number or (S)ales Amount? or Z to quit\n");
	       char option = scanner.next().charAt(0);//read the option to sort from user
	       
	        if(option == 'I'){  //if user enters I, then sort based on invoice number
	            Arrays.sort(purchases, new PurchaseInvoiceNumberSorter());
	            printArray(purchases);  //print array after sort
	        }
	        else if(option == 'S'){    //else if user enter S, sort based on sales amount
	            Arrays.sort(purchases, new PurchaseSalesAmountSorter());
	            printArray(purchases);  //print array after sort
	        }
	        else if(option == 'Z') {
	        	run = false;
	        	System.out.println(" ");
	        }
	       
	        else{ //if user enters any other option then print invalid
	            System.out.println("Invalid option");
	        }
        }
           
     }
	       
	    
	 
	 

	    public static void printArray(Purchase[] purchases){
	        for(Purchase p : purchases) {   //iterate through each purchase element in the array and print its details
	            p.display();
	            System.out.println("\n");
	        }
	    }
	}

	//purchase class comparator based on invoice number
	class PurchaseInvoiceNumberSorter implements Comparator<Purchase> {
	    //@Override
	    public int compare(Purchase o1, Purchase o2) {
	        return Integer.valueOf(o1.getInvoiceNumber()).compareTo(Integer.valueOf(o2.getInvoiceNumber()));
	    }
	}

	//purchase class comparator based on sales amount
	class PurchaseSalesAmountSorter implements Comparator<Purchase> {
	    //@Override
	    public int compare(Purchase o1, Purchase o2) {
	        return Double.valueOf(o1.getSaleAmount()).compareTo(Double.valueOf(o2.getSaleAmount()));
	    }
}
