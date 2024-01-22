import java.io.*;
import java.util.*;
class Check{

	public static void main(String args[]) throws IOException{


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter First Name:");
	String name = br.readLine();
	System.out.println(name);
	//br.close();

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Middle Name:");
	String st = sc.next();	
	System.out.println(st);

	//sc.close();
	
	System.out.println("Enter Last Name:");
	String Lname = br.readLine();
	System.out.println(Lname);
}

}
