class Parent4{

	static void name(){
	
		System.out.println("Ramchandra");
	}
}
class Child4 extends Parent4{

	static void name(){
	
		System.out.println("Akshay");
	}
}
class Test4{

	public static void main(String[] args){
	
		Parent4 p = new Child4();
		p.name();
	}
}
