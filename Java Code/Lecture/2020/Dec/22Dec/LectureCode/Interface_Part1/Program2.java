interface RBI{

	void loanType();
	void ROI();
}
class SBI implements RBI{

	public void loanType(){
	
		System.out.println("Home Loan");
	}
	public void ROI(){
	
		System.out.println("8.95");
	}
}
class Test{

	public static void main(String[] args){
	
		//SBI i = new SBI();
		RBI i = new SBI();
		i.loanType();
		i.ROI();
	}
}

