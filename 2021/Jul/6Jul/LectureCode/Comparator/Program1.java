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

	void dispDetails(){

		System.out.println(leaderName+" "+partyName+" "+years);
	}
}
class SortByName implements Comparator<Politics>{
	
	public int compare(Politics obj1,Politics obj2){
		
			return obj1.leaderName.compareTo(obj2.leaderName);
	}

}
class ComparatorDemo{
	
	public static void main(String[] args){
			
		ArrayList<Politics> al = new ArrayList<Politics>();

		al.add(new Politics("Sharad Pawar","NCP",60));
		al.add(new Politics("Narayan Rane","BJP",52));
		al.add(new Politics("Uddhav Thackeray","Shivsena",35));
		al.add(new Politics("Ashok Chavan","Congress",40));

		Collections.sort(al,new SortByName());
		
		for(Politics p : al){
			p.dispDetails();
		}
		System.out.println("=========================================");
		Comparator<Politics> sortByYears = new Comparator<Politics>(){

			public int compare(Politics obj1,Politics obj2){
				return obj1.years - obj2.years;
			}
		};

		Collections.sort(al,sortByYears);
		for(Politics p : al){
			p.dispDetails();
		}

	}

}
