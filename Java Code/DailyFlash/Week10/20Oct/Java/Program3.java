import java.util.*;
class Program3{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String st = sc.next();
		System.out.println("String is : "+st);

		System.out.println("Enter Sub-String:");
		String st1 = sc.next();
		System.out.println("Sub-String is : "+st1);
		
		System.out.println("Enter index : ");
		int ind = sc.nextInt();
		String st2 = st.substring(ind); 
		
		 	if(st1.equals(st2))
				
				System.out.println("True");
			else

				System.out.println("False");
		
	}
}
