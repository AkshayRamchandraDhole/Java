interface MumbaiMarket{

	default void quality(){
	
		System.out.println("Best Quality");
	}
	void price();
}
class SunilShop implements MumbaiMarket{

	public void price(){
	
		System.out.println("500-600");
	}
}
class TilakRoadShop implements MumbaiMarket{

	public void price(){
	
		System.out.println("800-900");
	} 
}
class Test2{

	public static void main(String[] args){
	
		MumbaiMarket m = new SunilShop();
		m.quality();
		m.price();
		
		MumbaiMarket m1 = new TilakRoadShop();
		m1.quality();
		m1.price();



	}
}
