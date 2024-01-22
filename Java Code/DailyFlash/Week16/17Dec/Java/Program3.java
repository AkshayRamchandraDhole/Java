class Parent{

	protected void display(){
	
		System.out.println("Ramchandra");
	}
}
class Child extends Parent{

	public void display(){
	
		System.out.println("Akshay");
	}
}
class Test3{

	public static void main(String[] args){
	
		Parent p1 = new Parent();
		p1.display();
		Parent p = new Child();
		p.display();
	}
}
