import java.util.*;
class SortedMapDemo{

	public static void main(String[] args){
		
		SortedMap<String,String> fileExt = new TreeMap<>();
		fileExt.put("CPP",".cpp");
		fileExt.put("C",".c");
		fileExt.put("Python",".py");
		fileExt.put("Java",".java");
		System.out.println(fileExt);
		
		//SortedMap Method
		//1) firstKey()
			System.out.println(fileExt.firstKey());	
		//2) lastKey()
			System.out.println(fileExt.lastKey());	
		//3) keySet()
			System.out.println(fileExt.keySet());	
		//4) values()
			System.out.println(fileExt.values());	
		//5) entrySet()
			System.out.println(fileExt.entrySet());	
		//6) headMap()
			System.out.println(fileExt.headMap("Java"));	
		//7) tailMap()
			System.out.println(fileExt.tailMap("Java"));	
		//8) subMap()
			System.out.println(fileExt.subMap("C","Java"));	
		
	}
	
}
