import java.util.*;
class ArrayListConstructor{
	
	public static void main(String[] args){

		ArrayList al1 = new ArrayList(); // Create a list with 10 empty 
		//System.out.println(al1.capacity());
		System.out.println(al1.size());

		ArrayList al2 = new ArrayList(500);
		System.out.println(al2.size());

		al2.add(10);
		al2.add(10);
		al2.add(10);
		al2.add(10);

		System.out.println(al2);

		ArrayList al3 = new ArrayList(al2);
		al3.add(20);
		al3.add(20);

		System.out.println(al3);
	
	
	}
	
}
