import java.util.*;
class Program1{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		StringBuffer st = new StringBuffer();
		String s = sc.next();
		st.append(s);
		for(int i=0;i<st.length();i++){
		
			if(i > 5)
				
				break;
			else
				System.out.println(st.charAt(i));
		}

	}
}
