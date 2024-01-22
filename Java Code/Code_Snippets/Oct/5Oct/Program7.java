import java.io.*;
class Program7{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char str1 = (char)br.read();
		br.read();
		String str2 = br.readLine();
		System.out.println(str2 +" " +str1);

	}
}
