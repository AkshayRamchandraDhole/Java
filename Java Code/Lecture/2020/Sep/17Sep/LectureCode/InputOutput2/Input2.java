import java.io.*;
class InputDemo2{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number:");
		//String num1=br.readLine();
		
	//	int num1 = br.readLine();//error: incompatible types: String cannot be converted to int
		
		int num1 = Integer.parseInt(br.readLine());
		System.out.println(num1);
		
		System.out.println("Enter Number:");
	//	String num2=br.readLine();
		
		int num2=Integer.parseInt(br.readLine());
		System.out.println(num2);

		System.out.println(num1+num2);
	}
}
