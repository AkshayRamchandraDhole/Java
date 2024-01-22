class Baba{

	void getProperty(){
	
		System.out.println("Bunglow");
	}
	void carieer(){
	
		System.out.println("Shashi Doctor vhava");
	}
	void marry(){
	
		System.out.println("Shashi=>Deepika Paddukone");
	}
}
class Shashi extends Baba{

	void carieer(){
	
		System.out.println("Shashi Teacher & Engg. zala");
	}
	void marry(){
	
		System.out.println("Kriti Sanon");
	}
}
class Kaka{

	public static void main(String[] args){
	
		Baba b = new Baba();
		b.getProperty();
		b.carieer();
		b.marry();

		Shashi s = new Shashi();
		s.getProperty();
		s.carieer();
		s.marry();

		Baba b1 = new Shashi();
		b1.getProperty();
		b1.carieer();
		b1.marry();
	}
}
