class BCCI{

	BCCI(){
	
		System.out.println("In BCCI Constructor");
	}
}
class IPL extends BCCI{

	IPL(){
	
		System.out.println("In IPL Constructor");
	}
}
class Match{

	public static void main(String[] args){
	
		BCCI b = new BCCI();
		IPL i = new IPL();
	}

}
