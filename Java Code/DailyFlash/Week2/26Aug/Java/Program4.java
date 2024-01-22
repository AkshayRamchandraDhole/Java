import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum = Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++){
		
			System.out.print(i*iNum+" ");
		}
		System.out.println();
	}
}
