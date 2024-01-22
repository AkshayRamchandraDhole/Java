import java.util.*;
class LinkedHashSetDemo{
	
	public static void main(String []args){
			
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Apple");
		lh.add("Amazon");
		lh.add("Microsoft");
		lh.add("Nividia");
		
		System.out.println(lh);

		HashSet hs = new HashSet();
		hs.add("Apple");
		hs.add("Amazon");
		hs.add("Microsoft");
		hs.add("Nividia");
		
		System.out.println(hs);
		
	}

}
