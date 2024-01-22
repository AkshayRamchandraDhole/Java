import java.util.*;
class OlympicGold{
	
	int numberGold = 0;
	String country = null;
	
	OlympicGold(String country,int numberGold){
		this.country = country;
		this.numberGold = numberGold;
	}
	public String toString(){
		return " Country=" + country + " Gold=" +numberGold;
	}
}
class SortByGold implements Comparator<OlympicGold>{
	
	public int compare(OlympicGold obj1,OlympicGold obj2){
		if(obj1.numberGold > obj2.numberGold)
			return 1;
		else if(obj1.numberGold < obj2.numberGold)
			return -1;
		else
			return 0;
	}
}
class Olympic{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue(new SortByGold());
		pq.offer(new OlympicGold("India",1));
		pq.offer(new OlympicGold("China",38));
		pq.offer(new OlympicGold("USA",39));
		pq.offer(new OlympicGold("Japan",27));
		
		System.out.println(pq);
		Iterator<OlympicGold> itr = pq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("======");
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
