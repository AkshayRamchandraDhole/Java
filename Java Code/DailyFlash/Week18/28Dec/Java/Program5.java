class Cricket{

	void batting(){
	
		System.out.println("Batting Required..");
	}
	void bowling(){
	
		System.out.println("Bowling Required...");
	}
}
class ECB extends Cricket{

	void ecb(){
	
		System.out.println("ECB works for England");
	}
}
class ICC extends Cricket{

	void icc(){
	
		System.out.println("ICC work for all world Cricket Board...");
	}
}
class BCCI extends Cricket{

	void bcci(){
	
		System.out.println("BCCI works for INDIA");
	}
}
class IPL extends BCCI{

	void ipl(){
	
		System.out.println("IPL only avaliable for most indian young player");
	}
}
class Test5{

	public static void main(String[] args){
	
		IPL i = new IPL();
		i.batting();
		i.bowling();
		i.bcci();
		i.ipl();

		ICC ic = new ICC();
		ic.batting();
		ic.bowling();
		ic.icc();

		ECB c = new ECB();
		c.ecb();
	}
}
