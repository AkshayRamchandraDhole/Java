class Parent1{

	final void m1(){
	
		System.out.println("In m1-Parent");
	}
}
class Child1 extends Parent1{

	final void m1(){
	
		System.out.println("In m1-Child");
	}
	public static void main(String[] args){
	
		Child1 c = new Child1();
		c.m1();
	}
}
