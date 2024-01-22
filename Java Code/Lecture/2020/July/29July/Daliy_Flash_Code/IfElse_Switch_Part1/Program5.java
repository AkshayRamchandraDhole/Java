class EvenOdd{

	static int isEven(int num){
	
		if(((num >> 1) << 1) == num){
			return 0;
		}else{
			return 1;
		}
	}
	

	public static void main(String args[]){
		int n = 12 ;
	if(EvenOdd.isEven(n)==0){
	
		System.out.println("Even...");
	}else{
	
		System.out.println("Odd...");
	}

	}
}
