import java.util.*;
class Program3{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		StringBuffer sb = new StringBuffer(sc.next());
		System.out.println("Using insert() Method : "+sb.insert(7,"Technologies"));
		System.out.println("Using charAt() Method : "+sb.charAt(7));
		System.out.println("Using substring() Method : "+sb.substring(7));
		System.out.println("Using replace() Method : "+sb.replace(7,15,"Biencaps"));
		System.out.println("Using reverse() Method : "+sb.reverse());
		System.out.println("Using delete() Method : "+sb.delete(7,15));

	}
}
