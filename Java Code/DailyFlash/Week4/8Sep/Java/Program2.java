import java.io.*;
class Program2{

	public static void main(String ...args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Rupees:");
		double iNum = Double.parseDouble(br.readLine());
		System.out.println("Rupees "+iNum+" into dollars: "+(iNum*73.53));
	}
}
