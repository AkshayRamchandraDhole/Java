import java.io.*;

class ThrowsDemo1{

	static ArithmeticException ae = new ArithmeticException();
	//static ArithmeticException ae = null ;
	static IOException io = new IOException();
	public static void main(String[] args){
	
		throw new ArithmeticException("Divide by zero");
		//throw ae;
		/*try{
			throw io;
		}catch(IOException i){
		
			System.out.println(i);
			System.out.println(i.getMessage());
			
		}*/
	}
}
