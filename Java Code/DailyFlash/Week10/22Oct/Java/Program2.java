import java.io.*;
class Program2{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String1 : ");
		String str1 = br.readLine();
		
		System.out.println("Enter String2 : ");
		String str2 = br.readLine();
		
		if(str1.startsWith(str2))
			
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
