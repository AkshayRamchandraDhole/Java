import java.io.*;
class Program3{

	public static void main(String ...args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
	        System.out.println(" Quotient : "+iNum1/iNum2);	
	        System.out.println(" Reminder : "+iNum1%iNum2);	
	

	}
}
