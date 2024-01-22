class ShashiSir{

	ShashiSir(){
	
		System.out.println("Shashikant Bagal");
	}

	class Core2web{
	
		void teaching(){
		
			System.out.println("Teaching Done Here..");
		}
	}
	class Biencaps{

		void product(){
		
			System.out.println("New Product Done Here..");
		}
	
	}

	public static void main(String[] args){
	
		ShashiSir s2014 = new ShashiSir();

		ShashiSir.Core2web s2017 = s2014.new Core2web();
		s2017.teaching();

		ShashiSir.Biencaps s2018 = s2014.new Biencaps();
	        s2018.product();	
	}
}
