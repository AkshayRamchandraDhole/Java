class Country{

	Country(String st1,String st2){
	
		System.out.println("In Country");
		System.out.println("State 1 : "+st1);
		System.out.println("State 2 : "+st2);
	}
}
class NorthCarolina{

	NorthCarolina(String ct1,String ct2){
	
		System.out.println("In State1");
		System.out.println("City 1 : "+ct1);
		System.out.println("City 2 : "+ct2);
	}
}
class NorthDakota{

	NorthDakota(String ctt1,String ctt2){
	
		System.out.println("In State2");
		System.out.println("City 1 : "+ctt1);
		System.out.println("City 2 : "+ctt2);
	}
}
class Main{

	public static void main(String[] args){
	
		Country c1 = new Country("North Carolina","NorthDakota");

		NorthCarolina n1 = new NorthCarolina("Elizabeth City","Rocky Mount");
		
		NorthDakota d1 = new NorthDakota("Watford City","Valley City");
	}
}
