import java.io.*;
class Program1{

	public static void main(String args[]) throws IOException{
	
		System.out.println("Enter Any Number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = Integer.parseInt(br.readLine());
		System.out.println("Your Enter Number is:"+iNum);
		
	}
}
