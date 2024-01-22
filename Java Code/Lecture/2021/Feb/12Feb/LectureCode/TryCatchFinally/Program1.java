class Biencaps{

	void products(){
	
		System.out.println("Bielearn");
	}
}
class TryDemo{

	public static void main(String[] args){
	
		System.out.println("Statement1");
		try{
		
			System.out.println("Statement2");
			//System.out.println("Statement3");
			System.out.println(10/0);
			System.out.println("Statement4");
		}catch(ArithmeticException ae){
		
			System.out.println("Statement5");
		}
			System.out.println("Statement6");
		
		try{
		
			System.out.println("Statement7");
			//System.out.println("Statement3");
			//System.out.println(10/0);

			//Biencaps be = null;

			Biencaps be = new Biencaps();
			be.products();
			System.out.println("Statement8");
		}catch(NullPointerException ae){
		
			System.out.println("Statement9");
		}
			System.out.println("Statement10");
	}
}
