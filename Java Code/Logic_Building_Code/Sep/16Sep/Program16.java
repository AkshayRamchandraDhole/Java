import java.io.*;
class Program16{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		long num=9;
		int iNum=Integer.parseInt(br.readLine());
		for(int i=1;i<=iNum;i++){
		
			System.out.print(num+" ");
			num=num*10+9;
		}
		System.out.println();

	}
}
