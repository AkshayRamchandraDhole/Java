import java.util.*;
class Program4{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String1 :");
		StringBuilder s1 = new StringBuilder(sc.next());
		
		System.out.println("Enter String2 :");
		StringBuilder s2 = new StringBuilder(sc.next());
	
		System.out.println(s1);
		System.out.println(s2);
		s1.reverse();
		s2.reverse();
		s1.append(s2);
		System.out.println(s1);

	}
}
