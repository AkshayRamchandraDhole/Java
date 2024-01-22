import java.util.*;
class TreeMapDemo{

	public static void main(String[] args){
		TreeMap<Integer,String> host = new TreeMap<>();
		
		host.put(2000,"Australia");
		host.put(2004,"Greece");
		host.put(2008,"China");
		host.put(2012,"UK");
		host.put(2016,"Brazil");
		System.out.println(host);
	
		//TreeMap methods
			//1) putIfAbsent()
			host.putIfAbsent(2020,"Japan");
			System.out.println(host);
			
			//2) entrySet()
			System.out.println(host.entrySet());
			
			//3) keySet()
			System.out.println(host.keySet());
		
			//4) values()	
			System.out.println(host.values());
	
			//5) get()
			System.out.println(host.get(2012));
			
			//6) getOrDefault()
			System.out.println(host.getOrDefault(2024,"France"));
			
			//7) remove()
			System.out.println(host.remove(2008));
			System.out.println(host);
	
			//8) replace()
			System.out.println(host.replace(2012,"London"));
			System.out.println(host);
	
			//9) replace()
			System.out.println(host.replace(2012,"London","UK"));
			System.out.println(host);
	}
}
