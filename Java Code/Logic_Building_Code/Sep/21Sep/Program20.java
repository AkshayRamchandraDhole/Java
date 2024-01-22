import java.io.*;
class SeriesPerfect{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<=inputNum;i++){
		
			for(int num=1;num<=i-1;num++){
				if(i % num == 0)
					sum=sum+num;
			}
			if(sum==i)
				System.out.print(i+" ");
		sum=0;

		}
		System.out.println();
	}
}
