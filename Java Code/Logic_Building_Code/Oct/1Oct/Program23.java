import java.io.*;
class StringLength{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str1 = br.readLine();
		for(int i=0;i<str1.length();i++)
			System.out.println(str1.charAt(i));
	}
}
