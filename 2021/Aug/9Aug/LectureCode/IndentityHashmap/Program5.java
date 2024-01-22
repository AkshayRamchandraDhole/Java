import java.util.*;
class NavigableMapDemo{
	public static void main(String[] args){
		TreeMap<Integer,String> host = new TreeMap<>();
		host.put(2000,"Australia");
		host.put(2004,"Greece");
		host.put(2008,"China");
		host.put(2012,"UK");
		host.put(2016,"Brazil");
	
		System.out.println(host);
		//NavigableMap Method
			//1) firstKey()
			System.out.println(host.firstKey());
			
			//2) firstEntry()
			System.out.println(host.firstEntry());
			
			//3) lastKey()
			System.out.println(host.lastKey());
			
			//4) lastEntry()
			System.out.println(host.lastEntry());
			
			//5) higherKey()
			System.out.println(host.higherKey(2008));
			
			//6) higherEntry()
			System.out.println(host.higherEntry(2008));
			
			//7) lowerKey()
			System.out.println(host.lowerKey(2008));
			
			//8) lowerEntry()
			System.out.println(host.lowerEntry(2008));
			
			//9) ceilingKey()
			System.out.println(host.ceilingKey(2008));
			
			//10) floorKey()
			System.out.println(host.floorKey(2008));
			
			//11) pollFirstEntry()
			System.out.println(host.pollFirstEntry());
			System.out.println(host);
			
			//12) pollLastEntry()
			System.out.println(host.pollLastEntry());
			System.out.println(host);
	}
}
