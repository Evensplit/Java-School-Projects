package ch13Ex6;

import java.nio.file.*;
import java.util.List;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits {
	  private static boolean isValidAccNum(String accNum) {
	        if (accNum == null || accNum.length() != 6) {
	            return false;
	        }
	        int sum = 0;
	        for (int i = 0; i < 5; i++) {
	            if (!Character.isDigit(accNum.charAt(i))) {
	                return false;
	            }
	            sum += accNum.charAt(i) - '0';
	        }
	        if (!Character.isDigit(accNum.charAt(5))) {
	            return false;
	        }
	        int lastDigit = accNum.charAt(5) - '0';
	        return (sum % 10 == lastDigit);
	    }

    public static void main(String[] args) {
        Path fileIn = Paths.get("/root/sandbox/AcctNumsIn.txt");
        Path fileOut = Paths.get("/root/sandbox/AcctNumsOut.txt");
       
        // Write your code here
        try {
            List<String> lines = Files.readAllLines(fileIn);
            BufferedWriter writer = Files.newBufferedWriter(fileOut);

            for (String line : lines) {
                if (isValidAccNum(line)) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
    }
 }
}