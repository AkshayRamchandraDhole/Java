
//  1) import java.lang.*;

class ExamsCancel{		// 2) extends Object

	/* 3) Constructor
	 * 		ExamsCancel(){
	 *			
	 *			super()  //  Object class
	 *			x=10
	 *			z=30
	 * 		}
	 * */

	int x=10;     // instance variable

	static int y=20;  // static variable

	int z=30;    // instance variable

	//instance method

	void happy(){
	
		System.out.println("Thanks CM...");
	}

	// static method

	static void decisionPending(){
	
		System.out.println("Angry Faces...");
	}


	/*   4) Static Block
	 *
	 *   static{
	 *	
	 *	y=20
	 *
	 *   }
	 *
	 */
}

class Students{ 		// 1) extends Object

	/*	Constructor
	 *	Students(){
	 *		
	 *		super() //  Object 
	 *	}
	 *
	 * */

	public static void main(String args[]){
	
		ExamsCancel e = new ExamsCancel();

		e.happy();  // Thanks CM...

		// decisionPending();  // error: cannot find symbol
		
		e.decisionPending();  // Angry Faces...

		ExamsCancel.decisionPending();  // Angry Faces...
	}
}
