import java.util.*;
class HashSetDemo1{
	
	public static void main(String[] args){
		
		Set s = new HashSet();		
	//	System.out.println(s.capacity());
		s.add("Ashish");
		s.add("Kanha");
		s.add("Rahul");
		s.add("Rajesh");
		s.add("Badhe");
		s.add("Rahul");
		
		System.out.println(s);
		System.out.println(s.add("Kanha"));
		System.out.println(s.add("Badhe"));
	}

}
