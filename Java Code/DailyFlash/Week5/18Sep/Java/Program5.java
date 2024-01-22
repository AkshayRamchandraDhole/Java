import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Starting Value of Series: ");
		int iStart = Integer.parseInt(br.readLine());
		System.out.println("Enter Ending Value of Series: ");
		int iEnd = Integer.parseInt(br.readLine());
		for(int i=iStart;i<=iEnd;i++){
		
			int fact=1;
			for(int j=1;j<=i;j++){
			
				fact*=j;
			}
				System.out.println("Factorial of "+i+" = "+fact);
		}			
	}
}
