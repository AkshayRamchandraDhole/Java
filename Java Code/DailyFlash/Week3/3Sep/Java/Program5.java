import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		System.out.println("Enter Third Number:");
		int iNum3 = Integer.parseInt(br.readLine());
		String ans =(iNum1 < iNum2) ?(iNum1 < iNum3 ) ? "First Number is Minimum" : "Third Number is Minimum":(iNum2 < iNum3) ? "Second Number is Minimum": "Third Number is Minimum";
	        System.out.println(ans);	
	}
}
