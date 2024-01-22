class Inns_1{


	void innScore(){
	
		System.out.println("1st Inns Score : 88 runs ");
	}
}
class Inns_2 extends Inns_1{

	void innScore(){
	
		System.out.println("2nd Inns Score : 78 runs");
	}
}
class Test2{

	public static void main(String[] args){
	
		Inns_1 r = new Inns_1();
		r.innScore();

		Inns_1 a = new Inns_2();
		a.innScore();
	}
}
