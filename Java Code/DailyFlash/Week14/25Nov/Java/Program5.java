class DailyCricket{

	static int player=11;
	int over=12;
	class Team{
	
		String name;
		int allRounder;
		
		Team(String nm,int allR){
		
			name=nm;
			allRounder=allR;
		}
		void printValues(){
		
			System.out.println("Player = "+player);
			System.out.println("Over = "+over);
			System.out.println("Team Name = "+name);
			System.out.println("All Rounder = "+allRounder);
		}

	}
}
class Test1{

	public static void main(String[] args){
	
		new DailyCricket().new Team("MCG",7).printValues();
	}
}
