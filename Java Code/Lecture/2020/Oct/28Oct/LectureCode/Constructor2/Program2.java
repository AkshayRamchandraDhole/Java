class BCCI{

	String preName="Ganguly";
	int year=2;

	BCCI(){
	
		System.out.println("In BCCI Constructor");
	}

}
class IPL {

	IPL(){
	
		System.out.println("In IPL Consstructor");
	}
	
	IPL(BCCI obj){
	
		System.out.println("In IPL Parameterized Constructor");
		System.out.println("President="+obj.preName);
		System.out.println("Year="+obj.year);
	}

}
class Match{

	public static void main(String[] args){
	
		IPL obj1 = new IPL();

		//IPL obj2 = new IPL(new BCCI());

		BCCI b = new BCCI();

		IPL obj2 = new IPL(b);
	}
}
