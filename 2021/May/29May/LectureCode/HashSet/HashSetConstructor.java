import java.util.*;
class HashSetConstructor{

	public static void main(String[] args){
	
		HashSet hs = new HashSet();
		hs.add("Virat Kohli");
		hs.add("MS Dhoni");
		hs.add("Rohit Sharma");
		hs.add("Rishabh Pant");
		hs.add("Hardik Pandya");
		
		System.out.println(hs);
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//Methods
		
		//contains(Object)
		System.out.println(hs.contains("Shreyas Ayer"));
		
		//size()
		System.out.println(hs.size());
	
		//remove()
		hs.remove("Rishabh Pant");
		System.out.println(hs);
		
		//clear()
		hs.clear();
		System.out.println(hs);
	}
}
