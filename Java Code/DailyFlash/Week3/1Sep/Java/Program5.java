import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		if(iNum1 > iNum2)
			System.out.println("The Maximum number Amongest "+ iNum1+" & "+ iNum2 + " is :" +iNum1);
		else

			System.out.println("The Maximum number Amongest "+ iNum1+" & "+ iNum2 + " is :" +iNum2);


	
	}
}
