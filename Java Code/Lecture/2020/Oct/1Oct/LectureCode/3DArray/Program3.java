import java.io.*;
class Input3D{

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter no of plane : ");
		int plane = Integer.parseInt(br.readLine());
		
		System.out.println("Enter no of rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		System.out.println("Enter no of cols : ");
		int cols = Integer.parseInt(br.readLine());

		int marr[][][] = new int[plane][rows][cols];

		System.out.println("Enter Plane Element : ");
		for(int i=0;i<plane;i++){
		
			for(int j=0;j<rows;j++){
			
				for(int k=0;k<cols;k++){
				
					marr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}
		System.out.println("1st Plane are : ");
		for(int i=0;i<plane;i++){
		
			for(int j=0;j<rows;j++){
			
				for(int k=0;k<cols;k++){
				
					System.out.print(marr[i][j][k] +" ");
				}
				System.out.println(" ");
			}
			if(i==0)
				System.out.println("2nd Plane are : ");
		}
	}
}
