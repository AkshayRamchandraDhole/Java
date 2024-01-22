import java.util.*;
class DequeDemo{
	public static void main(String[] args){
		Deque dq = new ArrayDeque();
		
		//add()
		dq.add("C");

		//addFirst()
		dq.addFirst("CPP");
		
		//addLast()
		dq.addLast("Java");
		System.out.println(dq);
	
		//push()
		dq.push("Flutter");
		System.out.println(dq);
	
		//offerFirst()
		dq.offerFirst("Python");
		
		//offerLast()
		dq.offerLast("Javascript");
		System.out.println(dq);
		
		//poll()
		System.out.println(dq.poll());
		System.out.println(dq);
		
		//pollFirst()
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		
		//pollLast()
		System.out.println(dq.pollLast());
		System.out.println(dq);
		
		//remove()
		System.out.println(dq.remove());
		System.out.println(dq);
		
		//removeFirst()
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		
		//removeLast()
		System.out.println(dq.removeLast());
		System.out.println(dq);

		
		dq.add("C");
		dq.add("CPP");
		dq.add("Java");
		dq.add("Flutter");
		dq.add("Python");
		dq.add("Javascript");
		
		System.out.println(dq);
		
		//peek()
		System.out.println(dq.peek());
		System.out.println(dq);
		
		//peekFirst()
		System.out.println(dq.peekFirst());
		System.out.println(dq);
		
		//peekLast()
		System.out.println(dq.peekLast());
		System.out.println(dq);


		//Iterator
		Iterator itr = dq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	
		//descending Iterator
		Iterator itr1 = dq.descendingIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	



	}
}

