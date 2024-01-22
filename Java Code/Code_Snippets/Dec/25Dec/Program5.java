class Outer{

	static{
		System.out.println("Inner static");
	}
		class Inner{
		
			static{
			
				System.out.println("In Inner static");
			}
		}
	
	public static void main(String[] args){
	
		new Outer();
		Outer.Inner obj = new Outer().new Inner();
	}
}
