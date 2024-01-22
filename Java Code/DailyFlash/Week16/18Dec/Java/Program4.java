abstract class Cricket{

	abstract void favShots();
	void batting(){
	
		System.out.println("Good Batsman");
	}
}
class Player extends Cricket{

	void favShots(){
	
		System.out.println("Cover Drive");
	}
}
class Test4{

	public static void main(String[] args){
	
		Player p = new Player();
		p.batting();
		p.favShots();
	}
}

