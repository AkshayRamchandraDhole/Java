interface RBI{

	void repoRate();
}
class SBI implements RBI{

	public void repoRate(){
	
		System.out.println("9.66");
	}
}
class Customer{

	public static void main(String[] args){
	
		RBI i = new SBI();
		i.repoRate();
	}
}
