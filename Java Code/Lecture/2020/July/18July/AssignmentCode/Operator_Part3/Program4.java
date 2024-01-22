class Program4{

	public static void main(String args[]){
	
		int x = 27 ;
		long y = 27 ;
		float z = 27.0f ; 
		double a = 27.0 ; 
		char b = 'a' ;

		System.out.println("Int Complement="+(~x));	//-28
		System.out.println("Long Complement="+(~y));	//-28
	//	System.out.println("Float Complement="+(~z));error: bad operand type float for unary operator '~'

	//	System.out.println("Double Complement="+(~a));error: bad operand type float for unary operator '~'
	
		System.out.println("Char Complement="+(~b)); //-98
	}
}
