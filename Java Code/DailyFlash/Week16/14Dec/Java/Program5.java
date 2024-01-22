class Rectangle{

	int len,brd;

	Rectangle(int l,int b){
	
		len=l;
		brd=b;
	}
	void areaRec(){
	
		System.out.println("Area of Rectangle = "+(len*brd));
	}
	void perimeterRec(){
	
		System.out.println("Perimeter of Rectangle = "+(2*(len+brd)));
	}
}
class Square extends Rectangle{

	int side;
	Square(int s){
	
		super(s,s);
		side=s;
	}
	void areaSqu(){
	
		System.out.println("Area of Square = "+(side*side));
	}
	void perimeterSqu(){
	
		System.out.println("Perimeter of Square = "+(4*side));
	}
}
class Excute{

	public static void main(String[] args){
	
		//Rectangle r = new Rectangle(10,20);
		Square s = new Square(10);
		s.areaSqu();
		s.areaRec();
		s.perimeterSqu();
		s.perimeterRec();
		

	}
}
