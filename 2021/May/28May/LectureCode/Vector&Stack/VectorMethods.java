import java.util.*;
class VectorMethods{

	public static void main(String[] args){
			
			Vector v = new Vector();
			v.addElement("Shashi");
			v.addElement("Ashish");
			v.addElement("Kahna");
			v.addElement("Rahul");
			v.addElement("Badhe");
			v.addElement("Shashi");
	
			System.out.println(v);

			// 1) size()
			System.out.println(v.size());
		
			//2) capacity()
			System.out.println(v.capacity());
			
			//3) isEmpty()
			System.out.println(v.isEmpty());
			
			//4) elementAt(int index)
			System.out.println(v.elementAt(2));

			//5) setElementAt(element,int index)
			v.setElementAt("Rajesh",4);
			System.out.println(v);

			//6) removeElementAt(int index);
			v.removeElementAt(4);
			System.out.println(v);
		
			//7) removeElement(object)
			v.removeElement("Shashi");
			System.out.println(v);

			//8) removeRange(int index1,int index2)
			//v.removeRange(0,2);
			//System.out.println(v);
		
			//9) setSize();
			//v.setSize(2);
			System.out.println(v);
		
			//10) indexOf(int)
			System.out.println(v.indexOf("Shashi"));

			//11) firstElement()
			System.out.println(v.firstElement());
			
			//12) lastElement()
			System.out.println(v.lastElement());
			
			//13)sort()
			//v.sort(v);
			//System.out.println(v);
		
	}
}
