class Core2web{

}
class Biencaps{

}
class Demo3{

	void m1(Core2web c2w){
	
		System.out.println("Core2web Method");
	}
	void m1(Biencaps bie){
	
		System.out.println("Biencaps Method");
	}
}
class Test1{

	public static void main(String[] args){
	
		Demo3 d = new Demo3();
		d.m1(new Core2web());
		d.m1(new Biencaps());
	}
}
