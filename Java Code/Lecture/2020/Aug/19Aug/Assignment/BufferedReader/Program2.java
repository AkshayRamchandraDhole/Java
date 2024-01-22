import java.io.*;
class IPL{

	public static void main(String args[]) throws IOException{
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Team Name:");
		String sName = br.readLine();
	 

		System.out.println("Enter Captain Name:");
		String sCap = br.readLine();
		
		System.out.println("Enter Best Win Percentage Float Value:");
		float fNum = Float.parseFloat(br.readLine());

		System.out.println("Enter Number of Batsman:");
		int iNBat = Integer.parseInt(br.readLine());

		System.out.println("Enter Number of International Batsman:");
		int iINBat = Integer.parseInt(br.readLine());
		
		System.out.println("The IPL Team Name is:"+sName); 
		System.out.println("Its captain is:"+sCap); 
		System.out.println("It has the best win percentage of:"+fNum); 
		System.out.println("Number of Indian batsman are:"+iNBat); 
		System.out.println("Number of International Batsman:"+iINBat); 


	
	}
}
