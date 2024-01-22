import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Starting Value of Limit: ");
		int iStart = Integer.parseInt(br.readLine());
		System.out.println("Enter Ending Value of Limit: ");
		int iEnd = Integer.parseInt(br.readLine());
		for(int i=iStart;i<=iEnd;i++){
		
			if(i%2!=0)

				System.out.print(i*i*i+" ");
			else
				System.out.print(i*i+" ");
		}
		System.out.println();
			

	}
}
