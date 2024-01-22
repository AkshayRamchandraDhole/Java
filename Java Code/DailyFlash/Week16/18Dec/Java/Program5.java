abstract class PowerCalculator{

	abstract void getResult(int number);
}
class Square extends PowerCalculator{

	void getResult(int num){
	
		System.out.println("Square = "+(num*num));
	}
}
class Cube extends PowerCalculator{

	void getResult(int num){
	
		System.out.println("Cube = "+(num*num*num));
	}
}
class Test5{

	public static void main(String[] args){
	
		PowerCalculator p = new Square();
		p.getResult(10);
		
		Cube c = new Cube();
		c.getResult(10);
	}
}
