import java.util.*;
class VectorConstructors{

	public static void main(String[] args){
		
		Vector v = new Vector(4);
		System.out.println(v.capacity());

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v.capacity());

		Vector v1 = new Vector(3,2);
		System.out.println(v1.capacity());

		v1.addElement(1);
		v1.addElement(1);
		v1.addElement(1);
		v1.addElement(1);
		//System.out.println(v1);

		ArrayList al = new ArrayList();
		
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(20);

		System.out.println(al);

		Vector v2 = new Vector(al);
		System.out.println(v2);
		System.out.println(v2.capacity());
		
		v2.add(30);
		v2.add(30);
		
		System.out.println(v2);
		System.out.println(v2.capacity());
		//System.out.println(v2.size());
		
	
	}


}
