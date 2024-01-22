import java.util.*;
class Program3{

	boolean palindromeCheck(int num1){
	
		int rem=0;
		int rev=0;
		int tmp = num1;
		while(num1 > 0){
		
			rem = num1 % 10 ;
			rev = rev * 10 + rem;
			num1 = num1 / 10 ;

		}
		if(tmp==rev)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
	
		Program3 p = new Program3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<arr.length;i++){
		
			System.out.println("Enter Number");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		
			boolean t = p.palindromeCheck(arr[i]);

			if(t==true)

				System.out.println(i+" th index consists of palindrome number");
		}

	}
}
