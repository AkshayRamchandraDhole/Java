import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String st = br.readLine();
	
		if(st.length() > 5)
			System.out.println(st);
		else
			System.out.println("String is less than 5 ");
	}
}
