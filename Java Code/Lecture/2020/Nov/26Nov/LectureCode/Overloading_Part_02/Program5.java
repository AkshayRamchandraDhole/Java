class Core2web{

	/*void m2(){
	
		System.out.println("Parent m2");
	}*/
}
class Biencaps extends Core2web{

	/*void m2(){
	
		System.out.println("Child m2");
	}
	void m2(Biencaps bie){
	
		System.out.println("Overloading m2");
	}*/
}
class Demo5{

	void m1(Core2web c2w){
	
		System.out.println("Core2web Method");
	}
	void m1(Biencaps bie){
	
		System.out.println("Biencaps Method");
	}
}
class Test3{

	public static void main(String[] args){
	
		Demo5 d = new Demo5();

		Core2web c2w1 = new Core2web();
		d.m1(c2w1);

		Biencaps bie = new Biencaps();
		d.m1(bie);

		Core2web c2w2 = new Biencaps();
		d.m1(c2w2);

		//c2w2.m2();
		//c2w2.m2(bie);
	}
}
