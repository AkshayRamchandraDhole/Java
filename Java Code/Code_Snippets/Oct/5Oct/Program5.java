import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = new String();
		str1 = str1 + br.read();
		str1 = str1 + (char)br.read();
		System.out.println(str1);

	}
}
