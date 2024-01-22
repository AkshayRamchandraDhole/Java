class NestedDemo{

	public static void main(String[] args){
	
		try{
		
			System.out.println("In Outer try");

			try{
			
				System.out.println("Inside Inner try");
				//System.out.println(10/0);

			}catch(ArithmeticException ae){
			
				System.out.println("Inside Inner Catch(try)");
			}
		}catch(NullPointerException npe){
		
			System.out.println("In outer catch");

			try{
			
				System.out.println("Inside outer catch");

			}catch(ArithmeticException ae){
			
				System.out.println("Inside Inner Catch(catch)");
			}
		}finally{
		
			System.out.println("In Finally");

			try{
			
				System.out.println("Inside Inner finally(try)");
				//System.out.println(10/0);

			}catch(ArithmeticException ae){
			
				System.out.println("Inside Inner finally Catch(try)");
			}

		}
	}
}
