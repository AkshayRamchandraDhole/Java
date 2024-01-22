import java.util.*;
class Iterator1{

	public static void main(String[] args){

		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		
		System.out.println(v);

		Iterator i = v.iterator(); //Enum Cursor
		while(i.hasNext()){
			Integer in = (Integer)i.next();
			if(in % 4 == 0)
				i.remove();
			//System.out.println(e.nextElement());
		}
			System.out.println(v);
	}

}
