import java.io.*;
class Program2{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		char[] ch = str.toCharArray();
		int len=0;
		for(int i=0;i<ch.length;i++){
	
			len++;
		}
		System.out.println("Length of String is : "+len);
	}
}
