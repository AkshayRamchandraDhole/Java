class MarutiSuzuki{

	void engine(){
	
		System.out.println("BS-6 Engine with MarutiSuzuki Class");
	}
}
class Maruti extends MarutiSuzuki{

	void engine(){
	
		System.out.println("BS-6 Engine with Maruti");
	}
}
class Suzuki extends MarutiSuzuki{

	void engine(){
	
		System.out.println("BS-6 Engine with Suzuki");
	}
}

class Customer{

	public static void main(String[] args){
	
		MarutiSuzuki m1 = new MarutiSuzuki();
		m1.engine();
		
		Maruti m2 = new Maruti();
		m2.engine();
		
		Suzuki m3 = new Suzuki();
		m3.engine();
		
		//Maruti m4 = new MarutiSuzuki();
		MarutiSuzuki m4 = new Maruti();
		m4.engine();
		
		MarutiSuzuki m5 = new Suzuki();
		m5.engine();

	
	}
}
