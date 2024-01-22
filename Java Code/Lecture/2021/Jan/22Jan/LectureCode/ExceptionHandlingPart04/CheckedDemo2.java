import java.io.*;
class CheckedDemo2{

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println(br.readLine());
		System.out.println("Before Exception Caught");
		try{
			System.out.println(br.readLine());
		}catch(IOException e ){
		
			System.out.println("Exception Caught");
		}
		System.out.println("End of Program");
	}
}
