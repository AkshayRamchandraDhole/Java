import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Number:");
		int iNum1=Integer.parseInt(br.readLine());
		int iNum2=Integer.parseInt(br.readLine());
		System.out.println("Multiplication is:"+(iNum1 * iNum2));
		if(iNum1 > iNum2)
			System.out.println("Division is:"+(iNum1 / iNum2));
		else
			System.out.println("Division is:"+(iNum2 / iNum1));
	}
}
