import java.io.*;
class Program1{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str1 = br.readLine();
		
		System.out.println("Enter Char1 : ");
		char ch1 = (char)br.read();
		br.skip(1);
		
		System.out.println("Enter Char2 : ");
		char ch2 = (char)br.read();
		br.skip(1);

		System.out.println("Before Replace : "+str1);
		
		System.out.println("After Replace : "+(str1.replace(ch1,ch2)));

	}

}
