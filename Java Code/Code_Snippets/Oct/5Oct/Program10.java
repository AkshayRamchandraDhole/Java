import java.io.*;
class Program10{

	public static void main(String args[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char str1 = (char)br.read();
		isr.close();
		String str2 = br.readLine();
		System.out.println(str1 + str2);

	}
}
