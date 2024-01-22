import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of rows and cols : ");
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] arr3 = new int[row][col];
		System.out.println("Enter Element in First 2D Array:");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++)
				arr1[i][j] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Element in Second 2D Array:");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++)
				arr2[i][j] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("First Matrix is : ");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){
				
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Second Matrix is : ");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){
				
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++)
				arr3[i][j] = arr1[i][j]+arr2[i][j];
		}
		System.out.println("The Third Matrix is : ");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){
				
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}
}
