class Parent2{

	static void m1(){
	
		System.out.println("In m1-Parent");
	}
}
class Child2 extends Parent2{

	static void m1(){
	
		System.out.println("In m1-Child");
	}
	public static void main(String[] args){
	
		//Child2 c = new Child2();
		Parent2 p = new Child2();
		p.m1();
	}
}
