import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Starting And Ending Number:");
		int iStart = Integer.parseInt(br.readLine());
		int iEnd = Integer.parseInt(br.readLine());
	
		for(int i=iStart;i<=iEnd;i++){
		
			if(i % 2 != 0)
				System.out.println("Cube of "+i+" : "+(i*i*i)+" and Square of "+i+" : "+(i*i));
		}
	}
}
