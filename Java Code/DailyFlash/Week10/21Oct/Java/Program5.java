import java.io.*;
class Program5{

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String : ");
		String st1 = br.readLine();

		String s1 = new String(st1);
		
		System.out.println("Enter String : ");
		String st2 = br.readLine();

		String s2 = new String(st2);

		if(st1.hashCode() == st2.hashCode())
			System.out.println("Pointing to same location");
		else
			System.out.println("Not Pointing to same location");
	}
}
