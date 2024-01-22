import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum=Integer.parseInt(br.readLine());
		System.out.println("Second Predecessor : "+(iNum-2));
		System.out.println("Second Successor : "+(iNum+2));
	}
}
