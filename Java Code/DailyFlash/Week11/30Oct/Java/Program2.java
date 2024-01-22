import java.util.*;
class Program2{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.next();
		
		System.out.println("Enter Index : ");
		int ind = sc.nextInt();
		
		StringBuffer sb1 = new StringBuffer(s1);	
		System.out.println("The Character at : "+ind+" is : "+sb1.charAt(ind));
		
		System.out.println("Enter Index : ");
		String ch = sc.next();
		

		System.out.println("The index of : "+ch+" is :"+sb1.indexOf(ch));
	}
}
