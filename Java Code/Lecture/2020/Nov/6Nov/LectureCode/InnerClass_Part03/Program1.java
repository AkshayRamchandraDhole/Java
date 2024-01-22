class Outer1{

	int a = 10 ;
	class Inner1{

		int a=20;

		void m1(){
		
			int a=30;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Outer1.this.a);
		}
	
	}
	public static void main(String[] args){
	
		new Outer1().new Inner1().m1();
	}
}
