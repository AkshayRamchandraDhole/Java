class ExceptionDemo1{

	public static void main(String[] args){
	
		System.out.println("Before Exception");
		try{
		System.out.println(10/0);
		}catch(Throwable e ){
		
			System.out.println("Exception Handle");
		}
		System.out.println("After Exception");
	}
}
