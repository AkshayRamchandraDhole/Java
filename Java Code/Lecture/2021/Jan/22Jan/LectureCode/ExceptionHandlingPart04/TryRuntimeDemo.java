class TryRuntimeDemo{

	public static void main(String[] args){
	
		System.out.println("Before Exception Handle");
		try{
		
			System.out.println(10/0);

		}catch(ArithmeticException e){
		
			System.out.println("Exception Handled");
		}
		
		System.out.println("After Exception Handled");
	}
}
