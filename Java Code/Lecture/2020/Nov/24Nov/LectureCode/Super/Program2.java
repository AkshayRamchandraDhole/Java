class Parent1{

	Parent1(){
	
		System.out.println("Parent's Constructor");
	}
	void m1(){
	
		System.out.println("Parent's m1");
	}
}
class Child1 extends Parent1{

	Child1(){
	
		super();
		//super();
		System.out.println("Child's Constructor");
		//super();
	}
	void m1(){
	
		//super();
		System.out.println("Child's m1");
	}
	public static void main(String[] args){
	
		//Child1 c1 = new Child1();
		Parent1 c1 = new Child1();
		Parent1 c2 = new Parent1();
		c1.m1();
		//super();
		//System.out.println(c2.m1());
		c2.m1();
		//c2.m1();
	
	}
}
