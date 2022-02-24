package ch5Ex10;

import java.util.Scanner;

public class TwelveDays {
	 //main function
    public static void main(String[] args){

        //declaring day for user input and Scanner for reading input
        Byte day;
        Scanner readInput = new Scanner(System.in);

        //printing user a message to input date
        System.out.println("Enter day in between 1 to 12");
        day = readInput.nextByte();

        //checking weather user entered valid date or not. if date not less than 12 then it will exit the program
        if(day>12 || day<1) {
            System.out.println("Invalid Day");
            return;
        }

        //calling printday line for printing enter day to all other pervious days if exits using for loop
        //for(int i = day;i>=1;i--){
           getChoice(day);
        }


    
    //defining printDay function as static so that we dont need to create an object
    public static void getChoice(int day){
        switch (day){
            case 1:
                System.out.println("On the first day of Christmas");
                break;
            case 2:
                System.out.println("On the second day of Christmas");
                break;
            case 3:
                System.out.println("On the third day of Christmas");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas");
                break;
            case 5:
                System.out.println("On the fifth day of Christmas");
                break;
            case 6:
                System.out.println("On the sixth day of Christmas");
                break;
            case 7:
                System.out.println("On the seventh day of Christmas");
                break;
            case 8:
                System.out.println("On the eighth day of Christmas");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas");
                break;
            case 10:
                System.out.println("On the tenth day of Christmas");
                break;
            case 11:
                System.out.println("On the eleventh day of Christmas");
                break;
            case 12:
                System.out.println("On the twelfth day of Christmas");
                break;
        }
        System.out.println("my true love gave to me ");

        //calling printGiifts() for printing gifts on that day
        printGifts(day);
        return;
    }
    //defining printGifts() for printing gifts on the user input day . it is static method so that we dont need to create an object
    public static void printGifts(int day){
        switch (day){

            case 12:
                System.out.println("12 Drummers Drumming");
            case 11:
                System.out.println("Eleven Pipers Piping");
            case 10:
                System.out.println("Ten Lords a Leaping");
            case 9:
                System.out.println("Nine Ladies Dancing");
            case 8:
                System.out.println("Eight Maids a Milking");
            case 7:
                System.out.println("Seven Swans a Swimming");
            case 6:
                System.out.println("Six Geese a Laying");
            case 5:
                System.out.println("Five Golden Rings");
            case 4:
                System.out.println("Four Calling Birds");
            case 3:
                System.out.println("Three French Hens");
            case 2:
                System.out.println("Two Turtle Doves and");
            case 1:
            	if(day ==1)
                System.out.println("a Partridge in a Pear Tree");
            	else if(day ==12)
            		System.out.println("And a Partridge in a Pear Tree");
                
            	else
            		System.out.println("And Partridge in a Pear Tree");
        }
    }

}
