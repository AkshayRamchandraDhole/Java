class Demo{

	void m1(int x){
	
		System.out.println("Int in m1-I");
		System.out.println("X = "+x);
	}
	void m1(char x){
	
		System.out.println("Char in m1");
		System.out.println("X = "+x);
	}
	void m1(int y){
	
		System.out.println("Int in m1");
		System.out.println("Y = "+y);
	}

	public static void main(String[] args){
	
		Demo d = new Demo();
		d.m1(10);
		d.m1('A');

	}
}
