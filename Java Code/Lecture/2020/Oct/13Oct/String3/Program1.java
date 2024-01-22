class IPL{

	IPL(){
	
		System.out.println("Dubai..");
	}
	IPL(String sponsor){
	
		System.out.println(sponsor);
	}

}

class Demo{

	public static void main(String[] args){
	
		IPL p1 = new IPL();
		IPL p2 = new IPL("Dream11");
	}
}
