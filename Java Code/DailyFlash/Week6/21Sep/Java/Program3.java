import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Year:");
		int iYear = Integer.parseInt(br.readLine());
		if((iYear % 4 == 0 && iYear % 100 !=0) || (iYear % 400 == 0))
			
			System.out.println(iYear+" is Leap Year....");
		else
			System.out.println(iYear+" is not Leap Year....");
	}
}
