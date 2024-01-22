import java.io.*;
class Program1{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Plane : ");
		int p = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of Rows : ");
		int r = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of Cols : ");
		int c = Integer.parseInt(br.readLine());

		int[][][] arr = new int[p][r][c];
		int sum=0;
		System.out.println("Enter Element : ");
		for(int i=0;i<p;i++){
		
			for(int j=0;j<r;j++){
			
				for(int k=0;k<c;k++){
				
					arr[i][j][k] = Integer.parseInt(br.readLine());
					sum+=arr[i][j][k];
				}
			}
		}
		System.out.println("Sum : "+sum);

	}
}
