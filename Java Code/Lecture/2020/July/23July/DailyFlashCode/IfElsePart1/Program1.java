class EvenOdd{

	static int checkEvenOdd(int n){
	
		if(n % 2 == 0 ){
		
			System.out.println("Number is Even:"+n);
			return 1;
		}else{
		
			System.out.println("Number is Odd:"+n);
			return 0;
		}
	}

	public static void main(String args[]){
	
	//	EvenOdd e = new EvenOdd();
		EvenOdd.checkEvenOdd(10);
		EvenOdd.checkEvenOdd(7);

	}
}
