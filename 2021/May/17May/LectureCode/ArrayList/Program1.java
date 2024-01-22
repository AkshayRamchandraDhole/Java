import java.util.*;
class ArrayListDemo1{

	public static void main(String[] args){
		
		ArrayList al = new ArrayList();
		al.add("Ashish");
		al.add("Rahul");
		al.add("Kanha");
		al.add("Shashi");
		al.add("Badhe");
		al.add("Ashish");

		System.out.println(al);

		ArrayList al1 = new ArrayList();
		al1.add("Madhur");
		al1.addAll(al);
		
		
		System.out.println(al1);

	}



}
