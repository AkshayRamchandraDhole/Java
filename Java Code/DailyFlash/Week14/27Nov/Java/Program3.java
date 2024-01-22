class Base{

	void method(){
	
		System.out.println("Base Class method()");
	}
}
class Derived extends Base{

	void method(){
	
		System.out.println("Derived Class method()");
	}
	void call(){
	
		super.method();
	}
	public static void main(String[] args){
	
		//Base b = new Base();
		Derived d = new Derived();
		d.call();
	}
}
