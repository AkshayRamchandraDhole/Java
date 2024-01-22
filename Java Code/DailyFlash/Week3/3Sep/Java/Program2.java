import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Min of Series:");
		int iMin = Integer.parseInt(br.readLine());
		System.out.println("Enter Max of Series:");
		int iMax = Integer.parseInt(br.readLine());

		for(int i=iMin;i<=iMax;i++){
		
			int fact=1;
			for(int j=1;j<=i;j++)
				fact*=j;
			System.out.println("Factorial of "+i+" = "+fact);
		}
	}
}
