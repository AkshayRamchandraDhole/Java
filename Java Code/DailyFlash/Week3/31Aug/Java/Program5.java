import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum = Integer.parseInt(br.readLine());
		System.out.print("Perfect Divisor of "+iNum+" is :");	
		for(int i=2;i<iNum;i++){
		
			if(iNum % i == 0)
				System.out.print(" "+i);
		}
		System.out.println();
	}
}
