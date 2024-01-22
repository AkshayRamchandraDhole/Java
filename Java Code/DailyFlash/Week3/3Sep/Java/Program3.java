import java.io.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Current (I) :");
		int iCur = Integer.parseInt(br.readLine());
		System.out.println("Enter Resistance (R) :");
		int iResi = Integer.parseInt(br.readLine());
		System.out.println("Voltage (V) = "+(iCur*iResi));
		
	}
}
