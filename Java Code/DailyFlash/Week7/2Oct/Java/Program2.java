import java.util.*;
class Program2{

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
	
		int[] even = new int[4];	
		int sum=0;
		System.out.println("Matrix Element is : ");
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.print(arr[i][j]+" ");
				
				if(arr[i][j] % 2 == 0){
					
					even[j]=arr[i][j];
					sum+=even[j];
				}

			}
			System.out.println();
		}
		System.out.println("Even Numbers are : ");
		for(int i=0;i<4;i++){
		
			System.out.println(even[i]);
		}

		System.out.println("Addition of even numbers are : "+sum);


	}

}
