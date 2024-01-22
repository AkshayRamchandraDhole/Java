import java.io.*;
class Program6{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char str1 = (char)br.read();
		String str2 = br.readLine();
		System.out.println(str1 + str2);

	}
}
