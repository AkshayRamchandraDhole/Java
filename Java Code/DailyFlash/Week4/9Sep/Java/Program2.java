import java.io.*;
class Program2{

	public static void main(String ...args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum=Integer.parseInt(br.readLine());
		for(int i=iNum;i>=1;i--){
		
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
