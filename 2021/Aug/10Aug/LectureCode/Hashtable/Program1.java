import java.util.*;
class DictionaryDemo{
	public static void main(String[] args){
		Dictionary dict = new Hashtable();
		
		dict.put("Virgin Galentic","Richard Branson");
		dict.put("Blue Origin","Jeff Bezos");
		dict.put("SpaceX","Elon Musk");

		System.out.println(dict);
	
		//Dictionary Method
			//1) size()
			System.out.println(dict.size());
			
			//2) isEmpty()
			System.out.println(dict.isEmpty());
			
			//3) get()
			System.out.println(dict.get("Blue Origin"));
			
			//4) remove()
			System.out.println(dict.remove("SpaceX"));
			System.out.println(dict);
			
			//elements()
			Enumeration itr = dict.elements();
			while(itr.hasMoreElements()){
				System.out.println(itr.nextElement());
			}
			
			Enumeration itr1 = dict.keys();
			while(itr1.hasMoreElements()){
				System.out.println(itr1.nextElement());
			}

	}

}
