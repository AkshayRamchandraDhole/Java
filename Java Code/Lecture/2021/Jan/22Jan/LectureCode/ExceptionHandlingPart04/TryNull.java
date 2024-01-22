class TryNull{

	int x = 10 ; 
	public static void main(String[] args){
	
		System.out.println("Before Exception Handle");
		try{
		TryNull n = null;
		System.out.println(n.x);
		}
		catch(NullPointerException e){
		
			System.out.println("Exception Handled");
		}

		System.out.println("After Exception Handled");

	}
}
