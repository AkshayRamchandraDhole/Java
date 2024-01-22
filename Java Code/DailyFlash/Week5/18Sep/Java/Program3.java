import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter increase value : ");
		int iInc = Integer.parseInt(br.readLine());
		for(int i=1;i<=50;i+=iInc){
				
			System.out.print(i+" ");
			
		}
		System.out.println();
			

	}
}
