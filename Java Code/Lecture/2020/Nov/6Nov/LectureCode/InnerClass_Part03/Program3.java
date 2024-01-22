class Outer3{

	class Inner3{
	
		void m1(){
		
			System.out.println("In Inner Class m1()");
		}
	}
	public static void main(String[] args){
	
		Outer3 o = new Outer3();
		//Outer3 o1 = null;
		Inner3 i = o1.new Inner3();
		i.m1();
	}

}
