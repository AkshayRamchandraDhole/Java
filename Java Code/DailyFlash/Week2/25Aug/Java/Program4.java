import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iSum=0;
		for(int i=1;i<=10;i++){
			System.out.println("Enter Number");
			int iNum = Integer.parseInt(br.readLine());
			iSum+=iNum;
		}
		System.out.println("Sum of Number is:"+iSum);
		System.out.println("Avg of Number is:"+iSum/10);
		
	}
}
