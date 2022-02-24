package ch13Ex3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison {
	 public static void main(String[] args) {
	        Path textFile = Paths.get("/root/sandbox/lyric1.txt");
	        Path wordFile = Paths.get("/root/sandbox/lyric2.txt");
	        
	        //write code here

            long size1 = textFile.toFile().length();
            long size2 = wordFile.toFile().length();
            
            System.out.println("The first file is " + size1 + " " + size2 + " " + (size1 * 100.0/size2));

 }
}