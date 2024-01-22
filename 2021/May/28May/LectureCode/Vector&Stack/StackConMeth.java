import java.util.*;
class StackContMeth{
	
	public static void main(String[] args){

		Stack s= new Stack();
		System.out.println(s.capacity());

		s.add("Amazon");
		s.addElement("Microsoft");
		s.push("Tesla");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());

		System.out.println(s.search("Microsoft"));
		System.out.println(s.search("Amazon"));
		
		System.out.println(s.indexOf("Amazon"));



	}


}
