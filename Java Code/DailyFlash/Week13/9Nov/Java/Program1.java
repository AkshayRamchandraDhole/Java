class DailyCricket{

	class MCGTeam{
	
		void experiencePlayer(){
		
			System.out.println("Good Experience");
		}
	}

	class SangharshTeam{
	
		void youngPlayer(){
		
			System.out.println("Good YoungPlayer");
		}
	}

	public static void main(String[] args){
	
		DailyCricket dc = new DailyCricket();

		DailyCricket.MCGTeam m1 = dc.new MCGTeam();
		m1.experiencePlayer();

		DailyCricket.SangharshTeam s1 = dc.new SangharshTeam();
		s1.youngPlayer();
	}
}
