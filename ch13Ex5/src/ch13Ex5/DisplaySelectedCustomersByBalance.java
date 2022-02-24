package ch13Ex5;

import java.util.ArrayList;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.Scanner;

public class DisplaySelectedCustomersByBalance {

public static void main(String[] args) {

ArrayList<Integer>id=new ArrayList<>();

ArrayList<String>fname=new ArrayList<>();

ArrayList<String>lname=new ArrayList<>();

ArrayList<Double>balance=new ArrayList<>();

Scanner input= new Scanner(System.in);

int i=0;

BufferedReader reader;

try

{

reader = new BufferedReader(new FileReader("C:\\Users\\JOSEE\\Desktop\\customers.txt"));

String line = reader.readLine();

  

while (line != null)

{

String []values=line.split(" ");

id.add(Integer.parseInt(values[0]));

fname.add(values[1]);

lname.add(values[2]);

balance.add(Double.parseDouble(values[3]));

line = reader.readLine();

}

reader.close();

}

catch (IOException e)

{

e.printStackTrace();

}

System.out.print("Enter enter any purchase amount display the record of the customer: ");

Double price=input.nextDouble();

  

int flag=0;

for(i=0;i<id.size();i++)

{

if(price<(balance.get(i)))

{

flag=1;

System.out.println("Customer id: "+id.get(i));

System.out.println("Name of customer: "+fname.get(i)+" "+lname.get(i));

System.out.println("Balance Owed :"+balance.get(i));   

}

}

if(flag==0)

{

System.out.println("Customer not found.\n");

}

}

  

}