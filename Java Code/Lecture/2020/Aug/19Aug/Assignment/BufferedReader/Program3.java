import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		
		System.out.println("Addition of "+iNum1+" and "+iNum2+" is: "+(iNum1+iNum2)); 
		System.out.println("Subtraction of "+iNum1+" and "+iNum2+" is: "+(iNum1-iNum2)); 
		System.out.println("Multiplication of "+iNum1+" and "+iNum2+" is: "+(iNum1*iNum2)); 
		System.out.println("Division of "+iNum1+" and "+iNum2+" is: "+(iNum1/iNum2)); 


	
	}
}
