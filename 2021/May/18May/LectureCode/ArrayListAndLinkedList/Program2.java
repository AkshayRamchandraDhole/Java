import java.util.*;
class ArrayListMethods{
	public static void main(String[] args){
		
			ArrayList al1 = new ArrayList();
			al1.add("Amazon");
			al1.add("Microsoft");
			al1.add("Apple");
			al1.add("Filpkart");
			al1.add("Amazon");

			System.out.println(al1);

			//add(int index, object)
			al1.add(2,"Oracle");
			System.out.println(al1);

			//indexOf(object)
			System.out.println(al1.indexOf("Amazon"));
			
			//lastIndexOf(object)
			System.out.println(al1.lastIndexOf("Amazon"));
			
			//size()
			System.out.println(al1.size());
		
			//remove(object)
			al1.remove("Amazon");
			System.out.println(al1);
		
			ArrayList al2 = (ArrayList)al1.clone();
			System.out.println(al2);
		
			//clear()
			al1.clear();
			System.out.println(al1);
			System.out.println(al2);

			//isEmpty()
			System.out.println(al1.isEmpty());
			System.out.println(al2.isEmpty());

			//contains(object)
			System.out.println(al2.contains("Amazon"));
			System.out.println(al2.contains("Cravita"));

			///toArray();
			//System.out.println(al2.toArray());
		
			//get(int index)
			System.out.println(al2.get(1));

			//set(int index,object)  // tya index remove krun tith value paste krte
			al2.set(3,"Cravita");
			System.out.println(al2);

			//remove(int index)
			al2.remove(3);
			System.out.println(al2);
			
			//fastRemove(int index)
			//al2.fastRemove(3);
			//System.out.println(al2);

			//addAll(Collection)
			al1.add("Microsoft");
			al2.addAll(al1);
			System.out.println(al2);

			//removeRange(int fromIndex,int toIndex)
			//al2.removeRange(0,2);
			//System.out.println(al2);

			
	}

}
