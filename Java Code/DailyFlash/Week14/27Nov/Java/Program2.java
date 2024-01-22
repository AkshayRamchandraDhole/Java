class Aus{
}
class Ind{
}
class Match{

	void batting(Aus a){
	
		System.out.println("Now Aus is batting...");
	}
	void batting(Ind i){
	
		System.out.println("After that Ind will come to batting....");
	}

	public static void main(String[] args){
	
		Aus a = new Aus();
		Ind i = new Ind();
		Match m = new Match();
		m.batting(a);
		m.batting(i);
	}
}
