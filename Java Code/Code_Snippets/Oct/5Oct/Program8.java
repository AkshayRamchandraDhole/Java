import java.io.*;
class Program8{

	public static void main(String args[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		float str1 = Integer.parseInt(br.readLine());
		float str2 = Integer.parseInt(br.readLine());
		System.out.println(++str1 +str2++);

	}
}
