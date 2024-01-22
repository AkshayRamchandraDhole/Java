import java.util.*;
class Program4{

	public static void main(String[] args){
	
		int[] arr1 = new int[]{10,35,22,7,6};
		int ind=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Element : ");
		int ele = sc.nextInt();
		System.out.println("Array is : ");
		for(int i = 0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
			if(ele == arr1[i])
				ind=i;
		}
		
		System.out.println("\n Position : "+(ind+1));


	}
}
