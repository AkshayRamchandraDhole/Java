class Parent{

	public void m1(){
	
		System.out.println("In Parent Method");
	}
	public void m2(){
	
		System.out.println("In Child m2");
	}
}
class Child extends Parent{

	public void m1(){
	
		System.out.println("In Child Method");
	}
}
class Core2web{

	public static void main(String[] args){
	
		Child t = new Child();
		t.m2();
	}
}
