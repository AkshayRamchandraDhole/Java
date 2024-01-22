import java.util.*;
class Program1{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("enter number of columns for row "+i+" : ");
			int r = sc.nextInt();
			arr[i] = new int[r];
		
		}

		System.out.println("Enter the Elements:");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Elements are : ");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
