class Shape{

	public void draw(){
	
		System.out.println("Drawing Shape");
	}
	public void erase(){
	
		System.out.println("Erasing Shape");
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
class Circle extends Shape{

	public void draw(){
	
		System.out.println("Drawing Circle");
	}
	public void erase(){
	
		System.out.println("Erasing Circle");
	}

}
class Triangle extends Shape{

	public void draw(){
	
		System.out.println("Drawing Triangle");
	}
	public void erase(){
	
		System.out.println("Erasing Triangle");
	}

}
class Test{

	public static void main(String[] args){
	
		Shape t1 = new Shape();
		Shape t2 = new Square();
		Shape t3 = new Circle();
		Shape t4 = new Triangle();

		t1.draw();
		t2.draw();
		t3.draw();
		t4.draw();
	}
}
