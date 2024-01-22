import java.util.*;
class Program4{

	public static void main(String args[]){
	
		System.out.println("Enter 100 Number:");
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		System.out.println("Reverse Order:-");
		for(int i=100;i>=1;i--){
			System.out.println("Reverse:"+i+" ");
			if(i%5==0){
			
				System.out.println("Divisible by 5:"+i);
			}
		}
		
	}
}
