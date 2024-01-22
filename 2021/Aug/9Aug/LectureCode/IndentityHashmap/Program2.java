import java.util.*;
class WeakDemo{

	public static void main(String[] args){
		WeakHashMap<String,Integer> h = new WeakHashMap<>();
	
		String s1 = new String("P V Sindhu");	
		String s2 = new String("Sushil Kumar");
		h.put(s1,2);
		h.put(s2,3);
		System.out.println(h);	
		s1=null;
		System.gc();
		System.out.println(h);
	}
}
