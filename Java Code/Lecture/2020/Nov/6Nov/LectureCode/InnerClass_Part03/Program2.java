class Outer2{

	class Inner2{
	
		class Inner3{
		
			void m1(){
			
				System.out.println("In Inner3 M1()");
			}
		}

		void m1(){
		
			System.out.println("In Inner2 m1()");
		}
	}
	public static void main(String[] args){
	
		//Outer2 o = new Outer2();
		//Inner2 i1 = o.new Inner2();
		//Outer2.Inner2.Inner3 i2 = i1.new Inner3();
		//i2.m1();
		new Outer2().new Inner2().new Inner3().m1();
		new Outer2().new Inner2().m1();
	}
}
