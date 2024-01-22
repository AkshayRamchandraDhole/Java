interface Outer1{

	void m1();

	interface Inner1{
	
		void m2();
	}
}
class XYZ implements Outer1,Outer1.Inner1{

	public void m1(){
	
		System.out.println("In m1");
	}
	public void m2(){
	
		System.out.println("In m2");
	}

}
class Test3{

	public static void main(String[] args){
	
		Outer1 o1 = new XYZ();
		o1.m1();
		//o1.m2();
		
		Outer1.Inner1 o2 = new XYZ();
		//o2.m1();
		o2.m2();

		XYZ x = new XYZ();
		x.m1();
		x.m2();
	}
}
