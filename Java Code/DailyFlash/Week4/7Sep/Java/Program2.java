import java.io.*;
class Program2{

	public static void main(String ...args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Mass (kg):");
		double dMass = Double.parseDouble(br.readLine());
		System.out.println("Enter Velocity (m/s):");
		double dVel = Double.parseDouble(br.readLine());
	        System.out.println("Kinetic Energy of that Object is : "+(0.5 * dMass * dVel * dVel));	
	

	}
}
