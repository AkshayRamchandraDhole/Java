import java.io.*;
class Program2{

	public static void main(String arsg[]) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Units:");
		int iUnit = Integer.parseInt(br.readLine());
		if(iUnit <= 50)
			System.out.println("For first 50 Unit Rs 0.50/unit:"+(iUnit * 0.50));
		else if(iUnit <= 150)
			System.out.println("For next 100 Unit Rs 0.75/unit:"+(iUnit * 0.75));
		else if(iUnit <= 250)
			System.out.println("For next 100 Unit Rs 1.20/unit:"+(iUnit * 1.20));
		else
			System.out.println("For above 250 Unit Rs 1.50/unit:"+(iUnit * 1.50));
	}
}
