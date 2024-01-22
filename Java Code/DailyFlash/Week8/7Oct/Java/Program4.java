import java.util.*;
class Program4{

	public static void main(String[] args){
	
		
		int[][] arr = new int[4][];
		
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[5];
		arr[3] = new int[3];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			
			System.out.println("Person "+i+" : ");
			for(int j=0;j<arr[i].length;j++){
			
				arr[i][j]=sc.nextInt();
			
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++){
		
			int sum = 0 ;
			for(int j=0;j<arr[i].length;j++){
			
				sum+=arr[i][j] ;
			}
				System.out.println("The number of book read by Person "+i+" is : "+sum);
		}
	}
}
