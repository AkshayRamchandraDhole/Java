class NumberCheck{

	void checkNumber(){
	
		int num1 = 18 ;
		int num2 = 45 ;
		if(num1 > num2){
			System.out.println("Number1 is Greater..");
		

		}else if(num1 == num2){
			System.out.println("Two Number are Equal...");
		
		}else{
		
			System.out.println("Number 2 is Greater...");
		}
	}

	public static void main(String args[]){
	
		NumberCheck nc = new NumberCheck();
		nc.checkNumber();
	}
}
