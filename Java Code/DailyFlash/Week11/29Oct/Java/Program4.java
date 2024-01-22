interface Team{

	void getPlayerNum();
	void getPlayerName();
	void defaultMethod(int wins,int loss);
}
class MI implements Team{

	public void getPlayerNum(){
	
		System.out.println("45");
	}
	public void getPlayerName(){
	
		System.out.println("Rohit Sharma");
	}
	public void defaultMethod(int wins,int loss){
	
		System.out.println("Wins="+wins);
		System.out.println("Loss="+loss);

	}

	public static void main(String[] args){
	
		MI m1 = new MI();
		//Team t = new Team();
		m1.getPlayerNum();
		m1.getPlayerName();
		m1.defaultMethod(0,0);

	}
}
