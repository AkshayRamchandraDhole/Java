import java.io.*;
class Arithmetic{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two number:");
		int a = Integer.parseInt(br1.readLine());

		String x = br1.readLine();
		
		int b = Integer.parseInt(x);

		//float c = Float.parseFloat(br1.readLine());
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	//	System.out.println("C = "+c);
		
		System.out.println("A + B : "+ (a + b));
		System.out.println("A - B : "+ (a - b));
		System.out.println("A * B : "+ (a * b));
		System.out.println("A / B : "+ (a / b));

	}
}
