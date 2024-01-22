import java.io.*;
class Program4{

	public static void main(String ...args) throws IOException{

		for(int i=4;i>=1;i--){
		
			for(int j=1;j<=i;j++){
			if(j%2==0)
				System.out.print("= ");
			else
				System.out.print("+ ");
		}
		
		System.out.println();
		}
	}
}
