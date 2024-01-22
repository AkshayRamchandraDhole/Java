class Outer{

	int x=10;
	static int y=20;


	void outerM1(){
	
		System.out.println("In Outer M1() Method");
	}

	static void outerM2(){
	
		System.out.println("In Outer M2() Method");
	}

	class Inner{
	
	/*	static int x=10;
	         
		public static void main(String[] args){
		
		}*/

		void innerM1(){
		
			System.out.println("In Inner M1() Method");
			System.out.println(x);
			System.out.println(y);
			outerM1();
			outerM2();
		}

	}

	public static void main(String[] args){
	
		new Outer().new Inner().innerM1();
	}
}
