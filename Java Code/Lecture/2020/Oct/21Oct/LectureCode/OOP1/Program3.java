class BCCI{

	int x=10;

	BCCI(){
	
		System.out.println("In BCCI Constructor");
	}

	void rulesBCCI(){
	
		System.out.println("Rules By BCCI");
	}
}

class IPL extends BCCI{

	int y=20;
	IPL(){
	
		System.out.println("In IPL Constructor");
	}

	void rulesIPL(){
	
		System.out.println("Rules By IPL");
	}

}

class Demo{

	public static void main(String[] args){
	
		IPL ipl2020 = new IPL();
		ipl2020.rulesBCCI();
		ipl2020.rulesIPL();
		
		BCCI ipl2K = new BCCI();
		ipl2K.rulesBCCI();
		//ipl2K.rulesIPL();

	}
}
