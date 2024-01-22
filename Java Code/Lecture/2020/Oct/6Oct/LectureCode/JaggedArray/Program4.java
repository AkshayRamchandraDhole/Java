import java.util.*;
class JaggedDemo4{

	public static void main(String[] args){
	
		//int[][] yarr = { new int[] {1,2},new int[] {3,4,5}, new int[] {6,7,8,9}};
		int[][] yarr = { new int[2],new int[3], new int[4]};
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<yarr.length;i++){
		
			for(int j=0;j<yarr[i].length;j++){
			
				yarr[i][j] = sc.nextInt();
			}
			System.out.println();
		
		}
		System.out.println("Array is : ");
		for(int i=0;i<yarr.length;i++){
		
			for(int j=0;j<yarr[i].length;j++){
			
				System.out.print(yarr[i][j]+" ");
			}
			System.out.println();
		
		}
	}
}
