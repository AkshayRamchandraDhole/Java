class Papa{
	
	Papa(){
		//super()    Object
		System.out.println("In Papa Constructor...");
	}
}

class Akshay extends Papa{

	Akshay(){
		//super()    Papa
	
		System.out.println("In Akshay Constructor");
	}

	public static void main(String args[]){

		Akshay a = new Akshay();
		System.out.println("In main..");
	}
}
