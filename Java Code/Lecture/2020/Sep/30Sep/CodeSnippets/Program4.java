import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{
	
		Program4 p4 = new Program4();
		p4.getSalary();
	}

	void getSalary() throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double sal = Double.parseDouble(br.readLine());
		System.out.println(sal);

	}
}
