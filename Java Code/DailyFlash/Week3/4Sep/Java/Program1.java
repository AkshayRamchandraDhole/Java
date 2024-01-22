import java.io.*;
class Program1{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum=Integer.parseInt(br.readLine());
		for(int i=10;i>=1;i--)
			System.out.println("2 * "+i+" = "+(i*iNum));
	}
}
