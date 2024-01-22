import java.io.*;
class Program2{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Loop Iterate Value:");
		int itr = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<=itr;i++){
			
			System.out.println("Enter Integer Value:");
			int iNum = Integer.parseInt(br.readLine());
			if(iNum>50)
				break;
			else{
			
				sum+=iNum;
			}
		}
		System.out.println("Sum = "+sum);
	}
}
