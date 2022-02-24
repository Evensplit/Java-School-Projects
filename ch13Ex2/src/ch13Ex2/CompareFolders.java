package ch13Ex2;

import java.nio.file.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class CompareFolders {
    public static void main(String[] args) {
        // Write your code here
    	Path file1 = Paths.get("/root/sandbox/TestData1.txt");
    	Path file2 = Paths.get("/root/sandbox/TestData2.txt" );
    	Path file3 = Paths.get("/root/sandbox/TestData3.txt");
    	Path file4 = Paths.get("/root/sandbox/test/TestData3.txt");
    	
    	 //getting parent and its absolute path
        String s1 = file1.getParent().toFile().getAbsolutePath();
        String s2 = file2.getParent().toFile().getAbsolutePath();
        String s3 = file3.getParent().toFile().getAbsolutePath();
        String s4 = file4.getParent().toFile().getAbsolutePath();
        //comparing its paths
        if(s1.equals(s3) && s2.equals(s3)&& s4.equals(s3)) {
                System.out.println("All files are in the same folder.");
        }
        else {
                System.out.println("Files are not in the same folder");
        }
    
      
    }
}
