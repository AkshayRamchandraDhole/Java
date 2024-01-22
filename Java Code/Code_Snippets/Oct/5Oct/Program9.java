import java.io.*;
class Program9{

	public static void main(String args[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char str1 = (char)br.read();
		br.close();
		String str2 = br.readLine();
		System.out.println(str1 + str2);

	}
}
