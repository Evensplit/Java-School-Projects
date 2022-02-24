package ch13Ex9;



        //Path file = Paths.get("/root/sandbox/BankAccounts.txt");
import java.nio.file.*;//used to manipulate files
import java.io.*;//needs to find a class you are using
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.net.*;// can import any specific class from a package or all classes from a package in to your current code
public class ReadBankAccountsRandomly
{
   public static void main(String[] args)  
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file = Paths.get("/root/sandbox/BankAccounts.txt"); //read file by passing path as input
      
      //write code here
      String s = "0000,        ,00000.00" + System.getProperty("line.separator"); //separate lien suing line separator
      final int RECSIZE = s.length(); //length of string
      byte data[] = s.getBytes(); //getBytes() method encodes a given String into a sequence of bytes and returns an array of bytes
      ByteBuffer buffer = ByteBuffer.wrap(data);//ByteBuffer Class is used to wraps a byte array into a buffer.
      FileChannel fc = null;
      String delimiter = ",";
      String idString;
      int id;
      String name;
      double balance;
      final String QUIT = "9999"; //string to quit the program if enters 9999
      try
      {
         fc = (FileChannel)Files.newByteChannel(file, READ, WRITE); //create file channel to read file
         System.out.print("Enter account number >> "); 
         idString = keyBoard.nextLine(); //input the account number of user
         while(!idString.equals(QUIT)) //loop until user enters 9999
         {
            id = Integer.parseInt(idString); //convert id to integer
            fc.position(id * RECSIZE); //get the location in file
            fc.read(buffer); //read the data from file
            buffer= ByteBuffer.wrap(data); //wrap a byte array into buffer
            s = new String(data); // convet to string all information
            System.out.println("ID #" + id + "  " + s); //print the details
            System.out.print("Enter next account number or " + QUIT + " to quit >> "); //if user enters 9999 then quit
            idString = keyBoard.nextLine(); //input next account number
         }
         fc.close(); //close the file
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e); //catch exception here
      }
   }
}
        
        // Write your code here
      
  
