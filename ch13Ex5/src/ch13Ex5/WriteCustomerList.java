package ch13Ex5;


	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	public class WriteCustomerList {

	public static void main(String[] args) throws IOException
	{
	Scanner input= new Scanner(System.in);
	String fname,lname;
	int id;
	double balanceOwed;
	FileWriter fileWriter = new FileWriter("C:\\Users\\JOSEE\\Desktop\\customers.txt");
	PrintWriter printWriter = new PrintWriter(fileWriter);   
	while(true)
	{
	System.out.print("Enter id (-1 to stop): ");
	id=input.nextInt();
	if(id==-1)
	break;
	input.nextLine();
	System.out.print("Enter first name): ");
	fname=input.nextLine();
	System.out.print("Enter last name: ");
	lname=input.nextLine();
	System.out.print("Enter Balnamce owed: ");
	balanceOwed=input.nextDouble();
	printWriter.println(id+" "+fname+" "+lname+" "+balanceOwed);
	}
	printWriter.close();

 }
}