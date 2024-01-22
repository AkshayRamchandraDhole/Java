class Outer2{

	void m1(){
	
		System.out.println("Class M1");
	}

	interface Inner2{
	
		void m2();
	}
}
class XYZ extends Outer2 implements Outer2.Inner2{

	public void m1(){
	
		System.out.println("In m1");
	}
	public void m2(){
	
		System.out.println("In m2");
	}

}
class Test4{

	public static void main(String[] args){
	
		Outer2 o1 = new XYZ();
		o1.m1();
	//	o1.m2();
		
		Outer2.Inner2 o2 = new XYZ();
		//o2.m1();
		o2.m2();

		XYZ x = new XYZ();
		x.m1();
		x.m2();
	}
}
