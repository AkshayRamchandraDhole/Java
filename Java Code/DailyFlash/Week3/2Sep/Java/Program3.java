import java.io.*;
class Program3{

	public static void main(String arsg[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Distance:");
		int iDis = Integer.parseInt(br.readLine());
		System.out.println("Enter Time:");
		int iNum2 = Integer.parseInt(br.readLine());
		System.out.println("The Velocity of a Particle roaming in space is "+(iDis/iNum2)+" m/s");

	}
}
