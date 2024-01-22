import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Starting Range:");
		int iNum1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Ending Range:");
		int iNum2 = Integer.parseInt(br.readLine());
		
		int iCnt=0;
		for(int i=iNum1;i<=iNum2;i++){
		
			int count=0;
			for(int j=1;j<=i;j++){
			
				if(i%j==0)
					count++;
			}
			if(count==2){
				iCnt++;
				System.out.print(i+" ");
			}
		}
		if(iCnt==0)
			System.out.println("No Prime Number between range");
		else
			System.out.println("\n The Count is:"+iCnt);


	
	}
}
