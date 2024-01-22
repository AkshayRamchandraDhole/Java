import java.util.*;
class Program2{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int len = sc.nextInt();
		int[] arr= new int[len];
		int cnt=0;
		for(int i=0;i<len;i++){

		arr[i] = sc.nextInt();
		if(arr[i] > 1 && arr[i] % 2 !=0)
			cnt++;

		}
		for(int i=0;i<len;i++){
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The Number occuring odd number of times in an array : "+cnt);
	}
}
