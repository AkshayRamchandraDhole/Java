class CreditCard{

	void pay(){
	
		System.out.println("Pay using CreditCard");
	}

}
class DebitCard{

	void paid(){
	
		System.out.println("Paid using DebitCard");
	}
}
class Payment{

	void makePayment(CreditCard cc){

		System.out.println("Payment using CreditCard Object");
	}
	void makePayment(DebitCard dc){

		System.out.println("Payment using DebitCard Object");
	}
}
class Demo2{

	public static void main(String[] args){
	
		Payment p = new Payment();
		p.makePayment(new CreditCard());
		p.makePayment(new DebitCard());
	}
}
