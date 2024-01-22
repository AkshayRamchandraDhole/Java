abstract class Check1{

	Check1(){
	
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();
	 
	void normal(){
	
		System.out.println("This is normal method of abstract class");
	}
}
class Check2 extends Check1{

	void a_method(){
	
		System.out.println("This abstract method");
	}
}
class Test3{

	public static void main(String[] args){
	
		Check1 c = new Check2();
		c.a_method();
		c.normal();
	}
}
