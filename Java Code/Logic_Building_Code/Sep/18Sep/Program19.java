import java.io.*;
class PerfectNumber{

	public static void main(String args[]) throws IOException{
		
		int sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number : ");
		int inputNum = Integer.parseInt(br.readLine());
		for(int i=1;i<=inputNum-1;i++){
		
			if(inputNum%i==0)
				sum+=i;
		}
		if(inputNum==sum)
			
			System.out.println(inputNum+" is Perfect Number....");
		else
			System.out.println(inputNum+" is not Perfect Number....");
	}
}
