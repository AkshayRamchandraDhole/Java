import java.io.*;
class Program5{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		Float f = Float.parseFloat(br.readLine());
		System.out.println(str1 + " " +f);

	}
}
