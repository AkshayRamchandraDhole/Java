class Parent2{

	int x = 10;
	Parent2(){
	
		System.out.println("Parent's Constructor");
	}
	void m1(){
	
		System.out.println("Parent's m1");
	}
}
class Child2 extends Parent2{

	int x = 20 ;
	void m1(){
	
		System.out.println("Child's m1");
		System.out.println("X = "+x);
		System.out.println("X = "+super.x);
	}
	Child2(){
	
		System.out.println("Child's Constructor");
	}
	public static void main(String[] args){
	
		Parent2 c = new Child2();
		c.m1();

	}
}
