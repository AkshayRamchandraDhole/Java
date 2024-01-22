class Shape{

	public void draw(){
	
		System.out.println("Drawing Shape");
	}
}
class Square extends Shape{

	public void draw(){
	
		System.out.println("Drawing Square");
	}
	public void erase(){
	
		System.out.println("Erasing Square");
	}

}
class Test{

	public static void main(String[] args){
	
		Shape t1 = new Shape();
		Shape t2 = new Square();

		t1.draw();
		t2.draw();
	}
}
