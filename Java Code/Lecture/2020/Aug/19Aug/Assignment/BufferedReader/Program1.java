import java.io.*;
class Program1{

	public static void main(String args[]) throws IOException{
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter String:");
		String sName = br.readLine();
		System.out.println("Name:="+sName); 

		System.out.println("Enter Integer Value:");
		int iNum = Integer.parseInt(br.readLine());
		System.out.println("Integer:="+iNum); 
		
		System.out.println("Enter Float Value:");
		float fNum = Float.parseFloat(br.readLine());
		System.out.println("Float:="+fNum);

		System.out.println("Enter Double Value:");
		double dNum = Double.parseDouble(br.readLine());
		System.out.println("Double:="+dNum); 


		System.out.println("Enter Long Value:");
		long lNum = Long.parseLong(br.readLine());
		System.out.println("Long:="+lNum); 


		System.out.println("Enter Boolean:");
		boolean bNum = Boolean.parseBoolean(br.readLine());
		System.out.println("Boolean:="+bNum);

		System.out.println("Enter Character:");
		char chNm = (char)br.read();
		System.out.println("Character:="+chNm); 
	
	}
}
