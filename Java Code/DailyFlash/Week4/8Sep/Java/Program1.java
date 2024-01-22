import java.io.*;
class Program1{

	public static void main(String ...args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int iNum = Integer.parseInt(br.readLine());
		int sum=1;
		for(int i=1;i<=5;i++){
		
			System.out.print(sum+" ");
			sum+=iNum;
		}
		System.out.println();
	}
}
