import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str1 = br.readLine();
		
		System.out.println("Enter Char1 : ");
		char ch1 = (char)br.read();
		br.skip(1);

		System.out.println("String is : "+str1);
		
		System.out.println("First Occurence : "+str1.indexOf(ch1));
		System.out.println("Last Occurence : "+str1.lastIndexOf(ch1));

	}

}
