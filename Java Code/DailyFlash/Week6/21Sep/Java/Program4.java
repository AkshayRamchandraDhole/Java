import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		System.out.println("Enter Third Number:");
		int iNum3 = Integer.parseInt(br.readLine());
		String st = (iNum1 > iNum2)?(iNum1 > iNum3)?"Num1 is Greater":"Num3 is Greater": (iNum2 > iNum3) ?"Num2 is Greater":"Num3 is Greater";
		System.out.println(st);
	}
}
