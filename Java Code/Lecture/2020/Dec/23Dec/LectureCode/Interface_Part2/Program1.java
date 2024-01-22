interface A{

	void m1();
}
interface B extends A{

	void m2();
}
class AB implements B{

	public void m1(){
	
		System.out.println("In m1");
	}
	public void m2(){
	
		System.out.println("In m2");
	}
}
class Test1{

	public static void main(String[] args){
	
		AB o = new AB();
		o.m1();
		o.m2();

		A a = new AB();
		a.m1();
		//a.m2();
		
		B b = new AB();
		b.m1();
		b.m2();

	}
}
