import java.io.*;
class Program5{

	public static void main(String ...args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int iNum = Integer.parseInt(br.readLine());
		System.out.print("1 ");
		for(int i=1;i<=iNum;i++){
			int su=0;
			int tmp=i;
			for(int j=1;j<tmp;j++){
			
				if(tmp % j==0)
					su+=j;
			}
			if(su==tmp)
				System.out.print(tmp+" ");
		}
	}
}
