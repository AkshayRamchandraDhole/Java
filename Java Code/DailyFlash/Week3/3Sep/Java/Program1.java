import java.io.*;
class Program1{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum = Integer.parseInt(br.readLine());
		int iSum=0,tmp=iNum;
		for(int i=1;i<iNum;i++){
		
			if(iNum % i == 0)
				iSum+=i;
		}
		if(iNum==iSum)

			System.out.println(iNum+" is a Perfect Number..");
		else
			System.out.println(iNum+" is not a Perfect Number...");

	}
}
