import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Row:");
		int r = Integer.parseInt(br.readLine());
		for(int row=1;row<=r;row++){
		
			for(int space=4;space>=row;space--){
			
				System.out.print(" ");
			}

			for(int col=1;col<=row;col++){
			
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
