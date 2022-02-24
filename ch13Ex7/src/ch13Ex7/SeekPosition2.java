package ch13Ex7;

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeekPosition2 {
	  public static void main(String[] args) throws IOException {
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Please enter file name");
	       String fileName = scanner.nextLine();
	       
	       System.out.println("Please inter the position from where you want to read");
	       int positionStart = scanner.nextInt();
	       
	       System.out.println("please enter number of characters to diplay");
	       int positionEnd = scanner.nextInt();
	       
	       //loading the file
	       File file = new File(fileName);
	       FileInputStream fis = new FileInputStream(file);
	       byte[] data = new byte[(int) file.length()];
	       fis.read(data);
	       fis.close();
	       //converted read data to string
	       String str = new String(data, "UTF-8");
	       int finalPosition = positionStart+20;
	       //in loop using positionstart-1 because index start from in string
	       for(int i = finalPosition-1; i < positionEnd; i++){
	           //if no more extra char to read in string
	    	   
	           if(i > str.length()){
	               System.out.println("no more extra char in file, reached end of the file");
	               return;
	               
	           }
	         
	          System.out.print(str.charAt(i));
	       }
	       
	   }
}
   
      /*public static void main(String args[]) throws IOException
    	   {
    	       FileInputStream in = null;
    	       // Use a Scanner to read the user input as an int.
    	       Scanner input = new Scanner(System.in);
    	       String infile;
    	       int seek=0,read=0;
    	       boolean good;
    	       //Prompt the user to input a filename.
    	       System.out.print("Input filename: ");
    	       infile = input.nextLine();
    	       do {
    	           good = true;
    	           try {
    	               //Prompt the user to input a seek position
    	               System.out.print("Input seek position: ");
    	               seek = input.nextInt();
    	           } catch (InputMismatchException ex) {
    	               input = new Scanner(System.in);
    	               System.out.println("Please enter valid integer value.");
    	               good = false;
    	           }
    	       } while (!good);  
    	       input = new Scanner(System.in);
    	       do {
    	           good = true;
    	           try {
    	               //Prompt the user to input a read size
    	               System.out.print("Input read chars: ");
    	               read = input.nextInt();
    	           } catch (InputMismatchException ex) {
    	               input = new Scanner(System.in);
    	               System.out.println("Please enter valid integer value.");
    	               good = false;
    	           }
    	       } while (!good);  
    	       try {
    	           in = new FileInputStream(infile);
    	           in.skip(seek);
    	           byte[] text=new byte[read];
    	           in.read(text,0,read);
    	           String s = new String(text);
    	           System.out.println(infile+" read "+read+" chars from "+seek+" position. :"+s);
    	       }
    	       finally {
    	           if (in != null) {
    	               in.close();
    	           }
    	       }
    	   }
    	}*/

