import java.util.*;
class Program2{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		StringBuilder sb = new StringBuilder(sc.next());
		System.out.println("Capacity Before Concat : "+sb.capacity());
		sb.append("Technologies");
		System.out.println("Capacity After Concat with Technologies : "+sb.capacity());
		sb.append("Biencaps");
		System.out.println("Capacity After Concat with Biencaps : "+sb.capacity());

	}
}
