class SangharshPlayer{

	String pName = "Abhijeet Dakhare";
	int pCount=7;
	String bPos="Opener";

	void playerInfo(){
	
		System.out.println("Player Name : "+pName);
		System.out.println("Player Count : "+pCount);
		System.out.println("Player Playing Position : "+bPos);
		System.out.println("Good Hitting Batsman");
	}
}

class MCGPlayer{

	int numPlayer = 39;
	SangharshPlayer p = new SangharshPlayer();
	
	void dailyPlaying(){
	
		System.out.println("Number of Player : "+numPlayer);
		newPlayer();
	} 

	void newPlayer(){

		p.playerInfo();
	}
}

class Ground{

	public static void main(String[] args){
	
		MCGPlayer m = new MCGPlayer();
		m.dailyPlaying();
	}
}
