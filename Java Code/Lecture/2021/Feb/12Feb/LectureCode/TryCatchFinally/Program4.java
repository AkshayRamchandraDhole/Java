import java.io.*;
class FinallyDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		try{
		
			System.out.println("In try");
		}catch(Exception e){
		
			System.out.println("In Catch");
		}finally{
		
			System.out.println("In Finally");
			br.close();
		}
	}
}
