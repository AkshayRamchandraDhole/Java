import java.io.*;
class Program2{

	public static void main(String arsg[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());

		if(iNum1 < iNum2)

			System.out.println("The Minimum number amongst "+iNum1+" & "+iNum2+" is: "+iNum1);
		else
			System.out.println("The Minimum number amongst "+iNum1+" & "+iNum2+" is: "+iNum2);

	}
}
