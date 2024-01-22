import java.io.*;
class CheckedDemo1{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		br.close();
		//System.out.println(br.readLine());
		
		try{
			System.out.println(br.readLine());
		}catch(IOException e ){
		
			System.out.println("Buffered Pipe already close");
		}
	}
}
