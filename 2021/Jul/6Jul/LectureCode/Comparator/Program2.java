import java.util.*;
class Politics{

	String leaderName;
	String partyName;
	int years;

	Politics(String ln,String pn,int yr){
		
		this.leaderName = ln;
		this.partyName = pn;
		this.years = yr;
	}

	public String toString(){

		return leaderName+" "+partyName+" "+years;
	}
}
class SortByName implements Comparator<Politics>{
	
	public int compare(Politics obj1,Politics obj2){
		
			return obj1.leaderName.compareTo(obj2.leaderName);
	}

}
class CompareDemo{
	
	public static void main(String[] args){
			
		TreeSet<Politics> al = new TreeSet<Politics>(new SortByName());

		al.add(new Politics("Sharad Pawar","NCP",60));
		al.add(new Politics("Narayan Rane","BJP",52));
		al.add(new Politics("Uddhav Thackeray","Shivsena",35));
		al.add(new Politics("Ashok Chavan","Congress",40));

		System.out.println(al);

	}

}
