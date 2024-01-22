import java.io.*;
class Program5{

	public static void main(String arsg[]) throws IOException{
	
	/*	int ich='A';
		System.out.println("ASCII Value:"+ich); 
*/
		System.out.println("Enter Character:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iCh = (char) br.read();
		System.out.println("ASCII Value:"+iCh);

		
	}
}
