import java.util.*;
class USCompanies{
	
	public static void main(String[] args){
		
		Map<String,String> m = new HashMap<String,String>();
		
		//1) put()
	
		m.put("Amazon","Jeff Bezos");
		m.put("Microsoft","Bill Gates");
		m.put("Apple","Steve Jobs");
		m.put("SpaceX","Elon Musk");
		m.put("Facebook","Mark Zuckerbuge");
		System.out.println(m);
	
		//2) get(Key)
		System.out.println(m.get("SpaceX"));

		//3) remove(Key)
		m.remove("Apple");
		System.out.println(m);
	
		//4) containsKey()
		System.out.println(m.containsKey("SpaceX"));
		
		//5) containsValue()
		System.out.println(m.containsValue("Steve Jobs"));
	
		//6) isEmpty()
		System.out.println(m.isEmpty());

		//7) size()
		System.out.println(m.size());

		//8) keySet()
		System.out.println(m.keySet());
		
		//9) values()
		System.out.println(m.values());
	
		//10) entrySet()
		System.out.println(m.entrySet());
	}

}
