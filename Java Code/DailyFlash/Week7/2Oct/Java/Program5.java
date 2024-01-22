import java.util.*;
class Program5{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter Number of Columns : ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];
		System.out.println("Enter Matrix Element : ");
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.println("Enter Element : ");
				arr[i][j] = sc.nextInt();

			}
		}	
		System.out.println("Matrix Element is : ");
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}
		System.out.println("Transpose Matrix are : ");
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.print(arr[j][i]+" ");

			}
			System.out.println();
		}


	}

}
