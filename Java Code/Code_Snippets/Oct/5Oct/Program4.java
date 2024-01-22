import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int str1 = br.read();
		int str2 = br.read();
		System.out.println(++str1 + str2++);

	}
}
