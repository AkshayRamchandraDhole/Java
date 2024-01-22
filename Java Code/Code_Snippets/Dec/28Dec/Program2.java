class Parent{

	public void m1(){
	
		System.out.println("In Parent Method");
	}
}
class Child extends Parent{

	public void m1(){
	
		System.out.println("In Child Method");
	}


	public static void main(String[] args){
	
		Child t = new Parent();
		t.m1();
	}
}
