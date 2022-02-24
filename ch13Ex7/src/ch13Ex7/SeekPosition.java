package ch13Ex7;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeekPosition {
	 public static void main(String args[]) throws IOException
	   {
		 
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Please enter the file name");
	       String fileName = scanner.nextLine();
	       System.out.println("Enter a position number>> ");
	       int positionStart = scanner.nextInt();
	       //loading the file
	       File file = new File(fileName);
	       FileInputStream fis = new FileInputStream(file);
	       byte[] data = new byte[(int) file.length()];
	       fis.read(data);
	       fis.close();
	       //converted read data to string
	       String str = new String(data, "UTF-8");
	       
	       //adding 20 to given position
	       int finalPosition = positionStart + 20;
	       for(int i = positionStart - 1; i <= finalPosition; i++){
	           //if no more extra char to read in string
	           if(i>str.length()){
	               System.out.println("no more extra char in file, reached end of the file");
	               return;
	           }
	           System.out.print(str.charAt(i)+",");
	       }

	   }
 }
	     
	