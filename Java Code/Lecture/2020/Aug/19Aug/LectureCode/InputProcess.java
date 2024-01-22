import java.io.*;
class InputProcess{

	public static void main(String args[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Your Name:");
		String s1 = br.readLine();
		System.out.println(s1);
		
		System.out.println("Enter Character:");
		char s2 = br.readLine().charAt(0);
		System.out.println(s2); 

		System.out.println("Enter Integer Value:");
		int s3 = Integer.parseInt(br.readLine());
		System.out.println(s3); 
		


		System.out.println("Enter Character:");
		char s4 = (char) br.read();
		System.out.println(s4); 
		
		br.readLine();

		System.out.println("Enter Integer:");
		int s5 = Integer.parseInt(br.readLine());
		System.out.println(s5); 
		


		System.out.println("Enter Float Value:");
		float s6 = Float.parseFloat(br.readLine());
		System.out.println(s6);
		
		
		
		System.out.println("Enter Double Value:");
		double s7 = Double.parseDouble(br.readLine());
		System.out.println(s7);
		
		System.out.println("Enter Short Value:");
		short s8 = Short.parseShort(br.readLine());
		System.out.println(s8);


		System.out.println("Enter Byte Value:");
		byte s9 = Byte.parseByte(br.readLine());
		System.out.println(s9);
		
		System.out.println("Enter Boolean Value:");
		boolean s10 = Boolean.parseBoolean(br.readLine());
		System.out.println(s10);
		
		System.out.println("Enter Long Value:");
		long s11 = Long.parseLong(br.readLine());
		System.out.println(s11);
		
		System.out.println("Enter Character :");
		char s12 = (char) br.read();
		System.out.println(s12);





		
	}
}
