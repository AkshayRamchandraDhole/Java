import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Number:");
		int iNum1=Integer.parseInt(br.readLine());
		int iNum2=Integer.parseInt(br.readLine());
		System.out.println("Additon of Their Cube is:"+((iNum1*iNum1*iNum1) + (iNum2*iNum2*iNum2)));
		System.out.println("Subtraction of Their Square is:"+((iNum1*iNum1) - (iNum2 * iNum2)));
	}
}
