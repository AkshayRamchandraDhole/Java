import java.util.*;
class Program4{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int len = sc.nextInt();
		String []arr = new String[len];
		int cnt=0;
		for(int i=0;i<len;i++){
			
			arr[i] = sc.next();
		}
		for(int i=0;i<len;i++){
			
			for(int j=0;j<=i;j++){
				
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}

	}
}
