import java.io.*;
class Program1{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Min of Series:");
		int iMin = Integer.parseInt(br.readLine());
		System.out.println("Enter Max of Series:");
		int iMax = Integer.parseInt(br.readLine());
		System.out.println("Series of Odd Number Ranging between "+iMin+" & "+iMax+" is : ");
		for(int i=iMin;i<=iMax;i++){
		
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();

	
	}
}
