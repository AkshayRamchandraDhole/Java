class Demo2{

	void m1(String s1){
	
		System.out.println("String Method");
	}
	/*void m1(StringBuffer sb){
	
		System.out.println("StringBuffer Method");
	}*/
	void m1(Object obj){
	
		System.out.println("Object Method");
	}
}
class Test{

	public static void main(String[] args){
	
		Demo2 d = new Demo2();
		d.m1("Shashi");
		//d.m1(new StringBuffer("Shashi"));
		//d.m1(new StringBuilder("Shashi"));
		d.m1(new Object());
		d.m1(null);
	}
}
