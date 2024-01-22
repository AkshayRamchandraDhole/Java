abstract class Car{

	abstract void mileage();
	abstract void price();

	void seater(){
	
		System.out.println("Four Seater");
	}
}
class Buyer extends Car{

	void mileage(){
	
		System.out.println("Mileage");
	}

	void price(){
	
		System.out.println("864000");
	}

	void seater(){
	
		System.out.println("Five Seater");
	}

	public static void main(String[] args){
	
		//Car c = new Car();
		Buyer b1 = new Buyer();
		b1.seater();
		b1.mileage();
		b1.price();
		
		Car b2 = new Buyer();
		b2.seater();
		b2.mileage();
		b2.price();
	}
}
