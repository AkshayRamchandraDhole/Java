import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Min of Series:");
		int iMin = Integer.parseInt(br.readLine());
		System.out.println("Enter Max of Series:");
		int iMax = Integer.parseInt(br.readLine());
		for(int i=iMin;i<=iMax;i++){
		
			if(i%2==0)
				System.out.println("Cube of "+i+" : "+(i*i*i)+" and Square of "+i+" : "+(i*i));
		}

	
	}
}
