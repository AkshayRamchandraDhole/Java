class Parent{

	public void m1(){
	
		System.out.println("In no argument m1");
	}
}
class Child extends Parent{

	public void m1(String str){
	
		System.out.println("In String m1");
	}
	public void m1(int num){
	
		System.out.println("In int m1");
	}


	public static void main(String[] args){
	
		Parent t = new Child();
		t.m1();
		t.m1("Demo String");

	}
}
