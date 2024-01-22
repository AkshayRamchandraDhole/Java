class Program1{

	Program1(){
	
		System.out.println("In Default Constructor");
		nonStatic();
	}

	void nonStatic(){
	
		System.out.println("In Non-static method");
	}

	public static void main(String[] args){

		Program2 p = new Program2();

	}
}
