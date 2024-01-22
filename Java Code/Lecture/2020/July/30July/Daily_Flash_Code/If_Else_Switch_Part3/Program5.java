import java.util.*;
class CheckZero{

	public static void main(String args[]){
	
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0)
			System.out.println("Entered Number is equal to zero.");
		else if(num >= 0)
			System.out.println("Entered Number is greater than zero.");
		else 
			System.out.println("Entered Number is less than zero.");
	
	}
}
