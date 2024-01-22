import java.util.*;
class Program1{

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
	
		int[] dia = new int[row];	
		System.out.println("Matrix Element is : ");
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.print(arr[i][j]+" ");
				if(i==j)
					dia[i]=arr[i][j];

			}
			System.out.println();
		}
		System.out.println("Diagonal Element are : ");
		for(int i=0;i<dia.length;i++){
		
			System.out.println(dia[i]);
		}


	}

}
