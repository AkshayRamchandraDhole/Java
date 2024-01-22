abstract class Cricket{

	abstract void batting();
        abstract void bowling();
 	void wakeUp(){
	
		System.out.println("At 6 AM");
	}	
} 
interface Match{

	void innsScore();
	void fielding();
}
class Player1 extends Cricket{

	void batting(){
	
		System.out.println("Opening Batsman");
	}
	void bowling(){
	
		System.out.println("When Needed then avaliable for bowling");
	}
}
class Player2 implements Match{

	public void innsScore(){
	
		System.out.println("Inns Score Change per inns");
	}
	public void fielding(){
	
		System.out.println("Fine Leg");
	}
	void fielding(String st){
	
		System.out.println("fielding at "+st+" position");

	}
}
class Player3 extends Player1{

	void batting(){
	
		System.out.println("Batting at 4 Position");
	}
}
class Player{

	public static void main(String[] args){
	
		Player1 p1 = new Player1();
	        p1.batting();
		p1.bowling();	

		Cricket c1 = new Player1();
		c1.wakeUp();

		Player2 p2 = new Player2();
		p2.innsScore();
		p2.fielding();
		p2.fielding("Mid-Off");

		Player3 p3 = new Player3();
		p3.batting();

		Player1 p4 = new Player3();
		p4.batting();

	}
}
