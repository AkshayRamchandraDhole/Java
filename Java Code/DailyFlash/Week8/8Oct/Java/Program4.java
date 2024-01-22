import java.util.*;
class Program4{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows : ");
		int r = sc.nextInt();
		
		int[][] arr = new int[r][];
		for(int i=0;i<r;i++){
		
			System.out.println("Enter Number of  Cols for "+i+" rows : ");
			int c = sc.nextInt();
			arr[i] = new int[c];
		}

		System.out.println("Enter Jagged Array : ");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				System.out.println("Enter Element : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Even Number are : ");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				if(arr[i][j] % 2 == 0)
					
					System.out.println(arr[i][j]);
			}
		}

	}
}
