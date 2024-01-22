import java.io.*;
class Program10{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = (char)br.read();
		br.skip(1);
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);

	}
}
