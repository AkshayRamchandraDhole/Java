import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String1 : ");
		String str1 = br.readLine();
		
		System.out.println("Enter String2 : ");
		String str2 = br.readLine();
			
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());

	}

}
