import java.util.*;
class VectorDemo1{
	
	public static void main(String[] args){
		
		Vector v = new Vector();
		System.out.println(v.capacity()); // 10
		
		v.addElement(10);	
		v.addElement(20);	
		v.addElement(30);	
		v.addElement(40);	
		v.addElement(10);
		
		System.out.println(v);	
		System.out.println(v.capacity());	

		//Cursor

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
				
				System.out.println(e.nextElement());			

		}
	
	}

}
