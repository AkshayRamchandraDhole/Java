class ArithmeticOperator{

	int r = 45 ; 
	int v = 18 ;

	void disAthOp1(){
	
		System.out.println("Additon:"+(r + v));			// Additon
		System.out.println("Subtraction:"+(r - v)); 		// Subtraction
		System.out.println("Multiplication:"+(r * v)); 		// Multiplication
	}

	static void disAthOp2(){
	
		ArithmeticOperator a1 = new ArithmeticOperator();
		System.out.println("Division:"+(a1.r / a1.v)); 		// Division
		System.out.println("Modulo:"+(a1.r % a1.v)); 		// Modulo
	}
}

class Logical{

	int s = 10 ;
	int g = 17 ;
	boolean ans ;
	
	void disLoOp1(){
	
	ans=(s != g) && (s<g);
	System.out.println("Logical AND (&&):"+ans);
	
	}

	static void disLoOp2(){
	
		Logical l1 = new Logical();
		l1.ans=(l1.s == l1.g) || (l1.s > l1.g);
		System.out.println("Logical OR (||):"+l1.ans);

	}
}

class Bitwise{

	int j = 9 ;
	int s = 10 ;
	int ans ;

	void disBitOp1(){

		ans = j & s ;
		System.out.println("Bitwise AND (&):"+ans);

		ans = j | s ;
		System.out.println("Bitwise OR (|):"+ans);

		ans = j ^ s ;
		System.out.println("Bitwise EXOR(^):"+ans);

		int a = 27 ; 
		System.out.println("Bitwise Complement(~):"+(~a));

	}

	static void disBitOp2(){
		
		int x = 12 ;
		
		System.out.println("Bitwise left Shift:"+(x<<2));
		System.out.println("Bitwise Right Shift:"+(x>>2));
		System.out.println("Bitwise Unsigned Right Shift:"+(x>>>2));

		
	}
}



class Main{

	public static void main(String args[]){
	
	ArithmeticOperator a = new ArithmeticOperator();
	System.out.println("....Arithmetic Operator......");
	a.disAthOp1();	
	ArithmeticOperator.disAthOp2();

	System.out.println();
	Logical l = new Logical();
	System.out.println(".....Logical Operator....");
	l.disLoOp1();
	Logical.disLoOp2();

	System.out.println();
	Bitwise b = new Bitwise();
	System.out.println(".....Bitwise Operator.....");
	b.disBitOp1();
	Bitwise.disBitOp2();
	



	}
}
