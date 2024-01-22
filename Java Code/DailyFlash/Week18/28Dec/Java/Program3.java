class GopalTapari{


	void tpDukan(){
	
		System.out.println("TP Dukan");
	}
}
class GopalShop extends GopalTapari{

	void kiranaShop(){
	
		System.out.println("Kirana Shop");
	}
}
class GopalSuperShop extends GopalShop{

	void superShop(){
	
		System.out.println("Super Shop");
	} 
}
class Test3{

	public static void main(String[] args){
	
		GopalSuperShop r = new GopalSuperShop();
		r.tpDukan();
		r.kiranaShop();
		r.superShop();
	}
}
