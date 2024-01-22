import java.io.*;
class Program3{

	public static void main(String[] args) {
	
		Program3 p3 = new Program3();
		p3.getName();
	}

	void getName() throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		br.skip(2);
		String name = br.readLine();
		System.out.println(name);

	}
}
