import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length:");
		int iLen=Integer.parseInt(br.readLine());
		System.out.println("Enter Breadth:");
		int iBrd=Integer.parseInt(br.readLine());
		System.out.println("Area of rectangle = "+(iLen*iBrd));
	}
}
