import java.util.*;
class Program2{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String s = sc.next();
		
		System.out.println("Enter Index:");
		int ind = sc.nextInt();

		if(ind > s.length())
			System.out.println("Invalid Index");
		else{
			char ch = s.charAt(ind);
			if(ch>='A' && ch<='Z'){
				char ch1 = (char)((int)ch+32);
				s=s.replace(ch,ch1);
			}else if(ch>='a' && ch<='z'){
			
				char ch1 = (char)((int)ch-32);
				s=s.replace(ch,ch1);
			}
			
		}	
		System.out.println(s);

	}
}
