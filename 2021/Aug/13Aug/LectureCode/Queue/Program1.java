import java.util.*;
class QueueDemo{
	public static void main(String[] args){
		Queue q = new LinkedList();
		q.add("Bill Clinton");
		q.add("Geroge Bush");
		q.add("Barack Obama");
		q.add("Donald Trump");
		System.out.println(q);
		
		//1) offer()
		q.offer("Joe Biden");
		System.out.println(q);
		
		//2) peek()
		System.out.println(q.peek());
		
		//3) element()
		System.out.println(q.element());
		System.out.println(q);

		//poll()
		System.out.println(q.poll());
		System.out.println(q);
		
		//remove()
		System.out.println(q.remove());
		System.out.println(q);
		
	}
}
