class IndianFestival{

	void show(){
	
		System.out.println("Indian Festival start....");
	}
}
class Dasara extends IndianFestival{

	void dasara(){
	
		System.out.println("Dasara on 30 Oct");
	}
}
class Diwali extends IndianFestival{

	void diwali(){
	
		System.out.println("Diwali on 14 Nov");
	}
}
class KartikiEkadashi extends IndianFestival{

	void kekadashi(){
	
		System.out.println("Kartiki Ekadashi on 26 Nov");
	}
}
class Manus{

	public static void main(String[] args){

		Dasara d = new Dasara();
		d.show();
		d.dasara();

		Diwali di = new Diwali();
		di.diwali();

		KartikiEkadashi ke = new KartikiEkadashi();
		//ke.dasara();
		//ke.diwali();
		ke.kekadashi();
	}
}
