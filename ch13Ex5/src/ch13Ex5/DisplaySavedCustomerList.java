package ch13Ex5;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class DisplaySavedCustomerList

{

public static void main(String[] args)

{

BufferedReader reader;

try

{

reader = new BufferedReader(new FileReader("C:\\Users\\JOSEE\\Desktop\\customers.txt"));

String line = reader.readLine();

System.out.println("Record in the files are.\n");

while (line != null)

{

System.out.println(line);

// read next line

line = reader.readLine();

}

reader.close();

}

catch (IOException e)

{

e.printStackTrace();

}

}

  

}