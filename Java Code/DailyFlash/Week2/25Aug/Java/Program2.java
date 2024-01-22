import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{
	
		System.out.println("Enter Any Number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = Integer.parseInt(br.readLine());
		int iSum=0;
		for(int i=0;i<=iNum;i++)
			iSum+=i;
		System.out.println("Sum of Number is:"+iSum);
		
	}
}
