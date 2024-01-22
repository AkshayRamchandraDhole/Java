import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in),5);
		String str1 = br.readLine();
		br.skip(1);
		System.out.println(str1);
	}
}

