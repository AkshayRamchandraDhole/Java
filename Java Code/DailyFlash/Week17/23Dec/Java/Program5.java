interface MCG{

	void bowler();
	void wicKeeper();
}
interface Sangharsh extends MCG{

	void batsman();
	void fielder();
}
class NewTeam implements Sangharsh{

	public void bowler(){
	
		System.out.println("MCG have good bowler");
	}
	public void wicKeeper(){
	
		System.out.println("MCG have good WicKeeper");
	}
	public void batsman(){
	
		System.out.println("Sangharsh have good batsman");
	}
	public void fielder(){
	
		System.out.println("Sangharsh have good fielder");
	}
}
class Test4{

	public static void main(String[] args){
	
		NewTeam n = new NewTeam();
		n.bowler();
		n.wicKeeper();
		n.batsman();
		n.fielder();
	}
}
