import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2=Integer.parseInt(br.readLine());
		System.out.println("Enter the sign of Operation:");
		char ch= (char)br.read();
		switch(ch){
		
			case '+':
				System.out.println("Additon is:"+(iNum1 + iNum2));
			break;
			
			case '-':
				if(iNum1 > iNum2)

					System.out.println("Subtraction is:"+(iNum1 - iNum2));
				else
					System.out.println("Subtraction is:"+(iNum2 - iNum1));
			break;
			
			case '*':
				System.out.println("Multiplication is:"+(iNum1 * iNum2));
			break;
			
			case '/':
				if(iNum1 > iNum2)

					System.out.println("Division is:"+(iNum1 / iNum2));
				else
					System.out.println("Division is:"+(iNum2 / iNum1));
			break;
			
			case '%':
				System.out.println("Modulus is:"+(iNum1 % iNum2));
			break;
			
			default:
				System.out.println("Please Enter this sign(+,-,*,/,%)");
			break;

		}
	}
}
