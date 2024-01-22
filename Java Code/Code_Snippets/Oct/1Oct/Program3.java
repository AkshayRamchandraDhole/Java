import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in),5);
		String str = br.readLine();
		//br.skip(1);
		System.out.println(str);
	}
}

