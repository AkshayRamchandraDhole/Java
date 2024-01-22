class Core2Web extends RuntimeException{

	int a = 10 ;
}
class ExceptionDemo2{

	public static void main(String[] args){
	
		System.out.println("Before Exception");
		try{
			System.out.println(10/0);
		
		}catch(Core2Web e){
		
			System.out.println("Exception Handle");
		}
		System.out.println("After Exception");
	}
}
