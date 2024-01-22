class Divisible2{

	static boolean isDivisible(int dd, int dv){
	
		if(((dd >> dv) << dv) == dd){
			return true;
		}else{
			return false;
		}
	}
	

	public static void main(String args[]){
		int dividend = 12 ;
		int divisor = 1 ; // here i use 1 because 2^1 = 2 so we get 2 
	if(Divisible2.isDivisible(dividend,divisor)==true){
	
		System.out.println("Yes...");
	}else{
	
		System.out.println("No...");
	}

	}
}
