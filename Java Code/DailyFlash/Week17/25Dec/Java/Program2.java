interface Cricket{

	void batting();
	 interface Team{
	 
		 void score();
	 }
}
class Test2 implements Cricket,Cricket.Team{

	public void batting(){
	
		System.out.println("Batting Method");
	}
	public void score(){
	
		System.out.println("Score Method");
	}
	public static void main(String[] args){
	
		Test2 t = new Test2();
		t.batting();
		t.score();
	}
}
