import java.util.*;
class Program5{

	public static void main(String[] args){
	
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[4];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			
			System.out.println("Student "+i+" : ");
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
				System.out.println("Average of Student "+i+" is : "+(sum/arr[i].length));
		}
	}
}
