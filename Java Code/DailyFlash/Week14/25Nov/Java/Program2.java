class X{

	class Y{
	
		//static int a=10; // Inside Inner Class Static not allowed 
		static final int b=20;

		void printValues(){
		
			//System.out.println("A ="+a);
			System.out.println("B ="+b);
		}
		
	}

	public static void main(String[] args){
	
		X x1 = new X();
	        Y y1 = x1.new Y();
		y1.printValues();	
	}
}
