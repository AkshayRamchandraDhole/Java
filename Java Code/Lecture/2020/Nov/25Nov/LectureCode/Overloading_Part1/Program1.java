class XYZ{

	void m1(int x){
	
		System.out.println("Int m1");
		System.out.println("X = "+x);
	}
	void m2(float y,char z){
	
		System.out.println("float and char m1");
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
	}

	public static void main(String[] args){
	
		XYZ x = new XYZ();
		x.m1(10);
		x.m1('A');
		//x.m1(10l);
		x.m2(20.5f,'A');
	}
}
