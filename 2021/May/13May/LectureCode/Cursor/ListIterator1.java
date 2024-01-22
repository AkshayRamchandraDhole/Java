import java.util.*;
class ListIterator1{

	public static void main(String[] args){

		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		
		System.out.println(v);

		ListIterator i = v.listIterator(); //Enum Cursor
		while(i.hasNext()){
			Integer in = (Integer)i.next();
			if(in == 30)
				i.add(60);
			//System.out.println(e.nextElement());
		}
		while(i.hasPrevious())
			System.out.println(i.previous());
	}

}
