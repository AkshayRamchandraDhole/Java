import java.util.*;
class USCompanies{
	
	public static void main(String[] args){
		
		Map<String,String> m = new LinkedHashMap<String,String>();
		
		//1) put()
	
		m.put("Amazon","Jeff Bezos");
		m.put("Microsoft","Bill Gates");
		m.put("Apple","Steve Jobs");
		m.put("SpaceX","Elon Musk");
		m.put("Facebook","Mark Zuckerbuge");
		System.out.println(m);
	}

}
