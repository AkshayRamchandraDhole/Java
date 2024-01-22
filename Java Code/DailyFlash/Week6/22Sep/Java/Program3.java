import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader brOne = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brTwo = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Name:");
		String name = brOne.readLine();
		
		System.out.println("Enter Your SurName:");
		String surName = brTwo.readLine();

		System.out.println("Enter Name is : "+ name);
		System.out.println("Enter SurName is : "+ surName);

		brOne.close();
		brTwo.close();

		
	}
}
