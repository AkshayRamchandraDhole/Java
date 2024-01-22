class Parent5{

	protected void name(){
	
		System.out.println("Ramchandra");
	}
}
class Child5 extends Parent5{

	public void name(){
	
		System.out.println("Akshay");
	}
	public static void main(String[] args){
	
		Child5 c = new Child5();
		c.name();
	}
}
