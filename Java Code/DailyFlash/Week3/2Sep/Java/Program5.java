import java.io.*;
class Program5{

	public static void main(String arsg[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		System.out.println("Third Number:");
		int iNum3 = Integer.parseInt(br.readLine());
		String ans = (iNum1 > iNum2) ?(iNum1 > iNum3) ? "Num1 is Greater":"Num3 is Greater":(iNum2 > iNum3) ? "Num2 is Greater":"Num3 is Greater";
		System.out.println(ans);

	}
}
