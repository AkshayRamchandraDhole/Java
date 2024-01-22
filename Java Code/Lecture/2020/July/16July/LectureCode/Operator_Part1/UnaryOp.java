class UnaryOperator{

	public static void main(String arsg[]){
	
		int num = 10;

		System.out.println("Using + Unary :"+(+num));
		System.out.println("Using - Unary :"+(-num));
		System.out.println("Using ++ Unary :"+(++num));
		System.out.println("Using -- Unary :"+(--num));

	//	System.out.println("Using + Unary :"+(!num)); //error: bad operand type int for unary operator '!'
		
		boolean n = true;
		
		System.out.println("Using ! Unary :"+(!n));
	}
}
