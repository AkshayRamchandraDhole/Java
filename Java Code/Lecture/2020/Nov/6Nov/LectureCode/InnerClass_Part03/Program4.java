//this$0

class Outer4{

	class Inner4{
	
		void m1(){
		
			System.out.println("In Inner class");
		}
	}

	public static void main(String[] args){
	
		//Outer4 o1 = new Outer4();
		//Inner4 i1 = o1.new Inner4();
		 Outer4 o1 = new Outer4();
		 Outer4 o2 = new Outer4();


		//Outer4 o2 = new Outer4();
		//Inner4 i2 = o2.new Inner4();

		 Inner4 i1 = o1.new Inner4();
		 //Inner4 i2 = o2.new Inner4();
	}
}
