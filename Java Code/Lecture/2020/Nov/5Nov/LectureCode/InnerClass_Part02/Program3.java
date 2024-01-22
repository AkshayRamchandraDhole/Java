class Outer{

	int x=10;

	class Inner{
	
		void xyz(){
		
			System.out.println("In Inner Class Method");
		}

	}
/*
	static void display(){
	
		Outer o1 = new Outer();
		Inner i = o1.new Inner();
		i.xyz();
	}*/

}
class InnerDemo{

	public static void main(String[] args){
	
		Outer o = new Outer();
		System.out.println(o.x);
		
		Outer.Inner i = o.new Inner();
		i.xyz();

		//Outer.display();
			
	}

}
