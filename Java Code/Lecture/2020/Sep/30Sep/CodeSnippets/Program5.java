import java.io.*;
class Program5{

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		br.skip(3);
		String str = br.readLine();
		System.out.println(str);

	}
}
