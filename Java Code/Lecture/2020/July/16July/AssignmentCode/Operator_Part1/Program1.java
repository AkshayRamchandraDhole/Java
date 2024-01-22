class Dominos{

	int price = 200;
	int quantity = 2;
	static int total = 0;

	static void bill(){
			
		Dominos pizza = new Dominos();
		total = pizza.price * pizza.quantity;
		System.out.println("Pizza Bill is:"+total);

		Dominos fires = new Dominos();
		fires.price=250;
		fires.quantity=3;
		total = fires.price * fires.quantity;
		System.out.println("Fires Bill is:"+total);

	}

	public static void main(String args[]){

		Dominos.bill();
	}

}
