import java.io.*;
class InputDemo1{

	public static void main(String arsg[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		
	//	int n = isr.read();
	//	System.out.println(n);

		BufferedReader br = new BufferedReader(isr);
	//	String input = br.readLine();
	//	System.out.println(input);
		System.out.println(br.readLine());
	}
}
