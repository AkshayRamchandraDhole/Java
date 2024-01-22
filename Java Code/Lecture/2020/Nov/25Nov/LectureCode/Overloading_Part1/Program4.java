class OverloadingDemo{

	void m1(int x){
	
		System.out.println("Int in m1");
		System.out.println("X = "+x);
	}
	void m1(float y){
	
		System.out.println("float in m1");
		System.out.println("Y = "+y);
	}

}
class Test{

	public static void main(String[] args){
	
		OverloadingDemo od = new OverloadingDemo();
		od.m1('A');
		od.m1(10);
		od.m1(10l);
		//od.m1(10.5);
		od.m1(10.5f);
	}
}
