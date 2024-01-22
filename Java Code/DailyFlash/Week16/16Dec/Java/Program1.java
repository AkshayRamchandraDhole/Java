class Parent{

	void property(){
	
		System.out.println("Property");
	}
	void career(){
	
		System.out.println("Crickter..");
	}
}
class Child extends Parent{

	void career(){
	
		System.out.println("Architect..");
	}
}
class Test1{

	public static void main(String[] args){
	
		Parent p = new Parent();
		p.career();
		Child c = new Child();
		c.career();
	}
}
