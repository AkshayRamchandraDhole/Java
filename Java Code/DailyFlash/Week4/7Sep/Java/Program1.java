import java.io.*;
class Program1{

	public static void main(String ...args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		System.out.println("Before Swap Number:"+iNum1+" "+iNum2);
		iNum1=iNum1-iNum2; //30
		iNum2=iNum1+iNum2; // 50
		iNum1=iNum2-iNum1; // 20
	        System.out.println("After Swap Number:"+iNum1+" "+iNum2);	
	

	}
}
