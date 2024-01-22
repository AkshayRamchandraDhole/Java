import java.io.*;
class Program3{

	public static void main(String ...args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Hours:");
		int iHr=Integer.parseInt(br.readLine());
		System.out.println(iHr+" Hours Converted into Seconds : "+iHr*3600+" sec");
	}
}
