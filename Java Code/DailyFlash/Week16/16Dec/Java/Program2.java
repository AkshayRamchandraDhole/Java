class Parent2{

	Object name(){
	
		System.out.println("Using Object Class...");
		return "Ramchandra";
	}
}
class Child2 extends Parent2{

	String name(){
	
		System.out.println("Using String Class..");
		return "Akshay";
	}
}
class Test2{

	public static void main(String[] args){
	
		Parent2 p = new Parent2();
		p.name();
		Child2 c = new Child2();
		c.name();
	}
}
