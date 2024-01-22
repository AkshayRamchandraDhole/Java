class Parent{

	public void m1(){
	
		System.out.println("In Parent Method");
	}
}
class Child extends Parent{

	public void m1(){
	
		System.out.println("In Child Method");
	}
	public void m2(){
	
		System.out.println("In Child m2");
	}


	public static void main(String[] args){
	
		Parent t = new Child();
		t.m2();
	}
}
