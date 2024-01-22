import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		System.out.println("Enter Any Number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = Integer.parseInt(br.readLine());
		if(iNum % 2 == 0)
			System.out.println("Number is Even:"+iNum);
		else
			System.out.println("Number is Odd:"+iNum);
		
	}
}
