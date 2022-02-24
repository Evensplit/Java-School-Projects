package ch12Ex11;

import java.util.Scanner;

public class PlaceAnOrder {
	 public static void main(String[] args) {

         

         Scanner scan = new Scanner(System.in);

         int itemNumber[] = {111,222,333,444};

         double price[] = {0.89,1.47,2.43,5.99};

        

         int userItemNumber = 0, userQuantity = 0;

        

         try {

                System.out.print(" Enter item number : ");

                userItemNumber = Integer.parseInt(scan.nextLine());

         }catch(NumberFormatException e)

         {

                System.out.println(new OrderException(new OrderMessages().getMessage(0)).getExceptionMessage());

                System.exit(0);

         }

        

         if(userItemNumber < 0)

         {

                System.out.println(new OrderException(new OrderMessages().getMessage(1)).getExceptionMessage());

                System.exit(0);

         }

         else if(userItemNumber > 9999)

         {

                System.out.println(new OrderException(new OrderMessages().getMessage(2)).getExceptionMessage());

                System.exit(0);

         }

         try {

                System.out.print(" Enter quantity : ");

                userQuantity = Integer.parseInt(scan.nextLine());

               

         }catch(NumberFormatException e)

         {

                System.out.println(new OrderException(new OrderMessages().getMessage(3)).getExceptionMessage());

                System.exit(0);

         }

        

         if(userQuantity < 0)

         {

                System.out.println(new OrderException(new OrderMessages().getMessage(4)).getExceptionMessage());

                System.exit(0);

         }else if(userQuantity > 12)

         {

                System.out.println(new OrderException(new OrderMessages().getMessage(5)).getExceptionMessage());

                System.exit(0);

         }

        

         for(int i=0;i<itemNumber.length;i++)

         {

                if(itemNumber[i] == userItemNumber)

                {

                       double totalPrice = price[i]*userQuantity;

                       System.out.println(" Your order total : "+totalPrice);

                       System.exit(1);

                }

         }

        

         System.out.println(new OrderException(new OrderMessages().getMessage(6)).getExceptionMessage());

         scan.close();

   }
	
}
	/*final int HIGHITEM = 9999;
    final int HIGHQUAN = 12;
    int code;
    int x;
    boolean found;
    final int[] ITEM = {111, 222, 333, 444};
    final double[] PRICE = {0.89, 1.47, 2.43, 5.99}; 
    int item;
    int quantity;
    double price = 0;
    double totalPrice = 0;
    Scanner input = new Scanner(System.in);
  
    // write your code here


}*/
