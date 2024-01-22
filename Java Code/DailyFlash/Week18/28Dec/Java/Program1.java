class RealMe{


	void brandName(){
	
		System.out.println("RealMe");
	}
}
class RealMeXT extends RealMe{

	void version(){
	
		System.out.println("Andriod Version 10.0");
	}
}
class Test1{

	public static void main(String[] args){
	
		RealMeXT r = new RealMeXT();
		r.brandName();
		r.version();
	}
}
