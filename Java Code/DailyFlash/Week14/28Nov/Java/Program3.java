class Shape{

	void makeShape(int a){
	
		System.out.println("Square is to be drawn with side : "+a);
	}
	void makeShape(int a,int b){
	
		System.out.println("Rectangle is to be drawn with Length intValue1 : "+a+" and breadth intValue2 : "+b);
	}
	void makeShape(float a){
	
		System.out.println("Circle is to be drawn with radius floatValue : "+a);
	}
	public static void main(String[] args){
	
		Shape sh = new Shape();
		sh.makeShape(10);
		sh.makeShape(10,20);
		sh.makeShape(15.0f);
	}
}
