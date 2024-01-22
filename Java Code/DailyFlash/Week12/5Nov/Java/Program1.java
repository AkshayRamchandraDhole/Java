import java.io.*;
class Program1{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
		
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}
