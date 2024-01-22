import java.io.*;
class Program8{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = (char)br.read();
		br.skip(1);
		String str1 = br.readLine();
		System.out.println(str1);

	}
}
