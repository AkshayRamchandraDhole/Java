import java.util.*;
class Program4{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		int[][] arr = new int[row][];
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[3];
		System.out.println("Enter Matrix Element : ");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				System.out.println("Enter Element : ");
				arr[i][j] = sc.nextInt();

			}
		}	
		System.out.println("Matrix Element is : ");
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter Matrix is : ");

	}

}
