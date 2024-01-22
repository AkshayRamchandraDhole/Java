import java.util.*;
class Program5{

	static boolean checkMonotonic(int[] arr){
	
		boolean de = true ;
		for(int i=0;i<arr.length-1;i++){
		
				if(arr[i]<=arr[i+1])
					
					de = false; 		
				else
					de = true;
			
		}
		return de;

	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int len = sc.nextInt();
		int[] arr= new int[len];
		for(int i=0;i<len;i++){

			arr[i] = sc.nextInt();
	
		}
		for(int i=0;i<len;i++){
		
			System.out.print(arr[i]+" ");
		}
		if(Program5.checkMonotonic(arr) == false)
			
			System.out.println("The Array is monotonic");
		else
			System.out.println("The Array is not monotonic");


	}
}
