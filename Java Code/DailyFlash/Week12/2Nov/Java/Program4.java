class Program4{

	Program4(int a){
	
		System.out.println("In Default Constructor");
		nonStatic();
	}

	void nonStatic(){
	
		System.out.println("In Non-static method");
	}

	public static void main(String[] args){

		Program4 p = new Program4(10);

	}
}
