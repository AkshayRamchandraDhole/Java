abstract class Bank{

	abstract void getBalance();
}
class SBI extends Bank{

	void getBalance(){
	
		System.out.println("100");
	}
}
class HDFC extends Bank{

	void getBalance(){
	
		System.out.println("150");
	}
}
class AXIS extends Bank{

	void getBalance(){
	
		System.out.println("200");
	}
}
class Test1{

	public static void main(String[] args){
	
		Bank s = new SBI();
		s.getBalance();
		Bank h = new HDFC();
		h.getBalance();
		AXIS a = new AXIS();
		a.getBalance();
	}
}

