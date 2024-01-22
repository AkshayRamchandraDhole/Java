import java.util.*;
class Program4{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = sc.next();
		/*String s2 = "";
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++){

			System.out.println(ch[i]);
			if((s1.charAt(i) == ' '))
				System.out.println(s1.charAt(i));
			else{
				s2=s2+s1.charAt(i);
				System.out.println(s2);
			}
		}*/
		s1=s1.replaceAll("\\s"," ");
		System.out.println(s1);

	}
}
