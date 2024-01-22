import java.util.*;
class LangData{
	
	public static void main(String[] args){

		SortedSet s = new TreeSet();
		s.add("CPP");
		s.add("C");
		s.add("React");
		s.add("Python");
		s.add("Andriod");
		s.add("Java");
		s.add("C");
	
		System.out.println(s);

		//Methods

		//first()
		System.out.println(s.first());
		
		//last()
		System.out.println(s.last());

		//headSet(object)
		System.out.println(s.headSet("CPP"));
		
		//tailSet(object)
		System.out.println(s.tailSet("CPP"));
		
		//subSet(object,object)
		System.out.println(s.subSet("C","Python"));
	}

}
