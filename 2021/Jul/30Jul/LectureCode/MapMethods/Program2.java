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
		
		Set <Map.Entry<String,String>> entry = m.entrySet();
		
		Iterator <Map.Entry<String,String>> itr = entry.iterator();
		while(itr.hasNext()){
			
			Map.Entry <String,String> actualEntry = itr.next();
		
			//System.out.println(actualEntry.getKey());
			//System.out.println(actualEntry.getValue());
			if(actualEntry.getKey().equals("Apple"))
				actualEntry.setValue("Tim Cook");

		}	
			System.out.println(m);
		
	}

}
