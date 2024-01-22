class MIvsKXIPMatch{

	void superOver(){
	
		System.out.println("First Super Over");
	}
	void superOver(String specific){
	
		System.out.println("Second Super Over");
	}
}
class Player{

	public static void main(String[] args){
	
		MIvsKXIPMatch p = new MIvsKXIPMatch();
		p.superOver();
		p.superOver("Second");
	}
}
