import java.io.*;
class Program3{

	public static void main(String arsg[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Age:");
		int iAge = Integer.parseInt(br.readLine());
		System.out.println("Enter Sex (M/F):");
		char chMF = br.readLine().charAt(0);
		System.out.println("Enter Marital Status (Y/N):");
		char chYN = br.readLine().charAt(0);
		if( chMF == 'F')
			System.out.println("She will work only in urban areas...");
		else if(chMF == 'M' && (iAge>=20 && iAge<=40))
			System.out.println("He will work anywhere...");
		else if(chMF == 'M' && (iAge > 40 && iAge<=60))
			System.out.println("He will work in urban areas only");
		else
			System.out.println("!!!!!ERROR!!!!!");
	}
}
