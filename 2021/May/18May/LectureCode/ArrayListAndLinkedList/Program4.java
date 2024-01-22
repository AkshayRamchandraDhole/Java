import java.util.*;
class LinkedListMethods{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();
		ll.add("C");
		ll.add("CPP");
		ll.add("JAVA");
		ll.add("PYTHON");
		ll.add("OS");
		System.out.println(ll);

		//add(int index,object)
		ll.add(4,"Flutter");
		System.out.println(ll);

		//addFirst()
		ll.addFirst("React");
		System.out.println(ll);
		
		//addLast()
		ll.addLast("Angular");
		System.out.println(ll);
		
		//removeFirst()
		ll.removeFirst();
		System.out.println(ll);
		
		//removeLast()
		ll.removeLast();
		System.out.println(ll);
		
		//indexOf(Object)
		System.out.println(ll.indexOf("JAVA"));

		//set(int index,Object)
		ll.set(4,"Android");
		System.out.println(ll);

		//linkLast(Object)
		//ll.linkLast("HTML");
		//System.out.println(ll);

		//contains(Object)
		System.out.println(ll.contains("JAVA"));

		//size()
		System.out.println(ll.size());

		//System.out.println(ll.capacity());

		//remove(Object)
		ll.remove("OS");
		System.out.println(ll);

		//get(int index)
		System.out.println(ll.get(2));
		
		//peek()
		System.out.println(ll.peek());

		//element()
		System.out.println(ll.element());
		
		//poll()
		ll.poll();
		System.out.println(ll);

		//remove()
		ll.remove();
		System.out.println(ll);

		//offer()
		ll.offer("OS");
		System.out.println(ll);
		
		//offerFirst()
		ll.offerFirst("C");
		System.out.println(ll);
		
		//offerLast()
		ll.offerLast("CPP");
		System.out.println(ll);
	
		//push(Object)	
		ll.push("UNIX");
		System.out.println(ll);
		
		//pop()	
		ll.pop();
		System.out.println(ll);

		//clone()
		LinkedList ll1 = (LinkedList)ll.clone();
		System.out.println(ll1);

		//clear()
		ll.clear();
		System.out.println(ll);
		System.out.println(ll1);
	}
}
