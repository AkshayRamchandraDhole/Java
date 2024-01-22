interface ICC{

	void iccRules();
}
interface BCCI extends ICC{

	void bcciRules();
}
class Player implements BCCI{

	public void iccRules(){
	
		System.out.println("Rules Defined by ICC");
	}
	public void bcciRules(){
	
		System.out.println("Rules Defined by BCCI");
	}
}
class Test4{

	public static void main(String[] args){
	
		Player p = new Player();
		p.iccRules();
		p.bcciRules();
	}
}
