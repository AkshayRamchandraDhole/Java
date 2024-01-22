import java.util.*;
class Program5{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String s1 = sc.next();

		System.out.println("Enter Sub-string:");
		String s2 = sc.next();
		
		int lt = s1.lastIndexOf(s2);
		if(lt >= 0)
			
			System.out.println("Last Occurrence Index="+lt);	
		else
			System.out.println("Not A Substring");	



	}
}
