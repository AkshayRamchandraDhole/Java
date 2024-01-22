import java.io.*;
class Program2{

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String st = br.readLine();
		System.out.println(st);
		System.out.println(st.length());
	}
}
