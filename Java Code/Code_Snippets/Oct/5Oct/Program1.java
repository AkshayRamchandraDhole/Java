import java.io.*;
//import java.io.BufferedReader;
class Program1{

	public static void main(String args[]) throws IOException{
	
		//InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//float f1 = Integer.parseInt(br.readLine());
		//float f2 = Integer.parseInt(br.readLine());
		Float f = Float.parseFloat(br.readLine());
		if(f==1.1)
		//char str1 =(char)br.read();
		//isr.close();
		//String str2 = br.readLine();
		//str1 = str1 + (char)br.read();
			System.out.println(true);
		else
			System.out.println(false);
	}
}
