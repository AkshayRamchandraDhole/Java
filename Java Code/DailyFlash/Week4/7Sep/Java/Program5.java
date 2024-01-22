import java.io.*;
class Program5{

	public static void main(String ...args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number 1:");
		System.out.println("Enter Real Part:");
		int iReal1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Imaginary Part:");
		int iImg1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number 2:");
		System.out.println("Enter Real Part:");
		int iReal2 = Integer.parseInt(br.readLine());
		System.out.println("Enter Imaginary Part:");
		int iImg2 = Integer.parseInt(br.readLine());

		System.out.println("The Addition of "+iReal1+"+"+iImg1+"i"+" & "+iReal2+"+"+iImg2+"i"+" is "+(iReal1+iReal2)+"+"+(iImg1 + iImg2)+"i");
		
	

	}
}
