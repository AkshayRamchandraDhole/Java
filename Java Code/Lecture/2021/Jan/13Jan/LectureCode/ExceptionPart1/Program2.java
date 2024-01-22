class ExceptionDemo2{

	public static void main(String[] args){
	
		System.out.println("In Main");
		//ExceptionDemo2 e = null ; //new ExceptionDemo2();
		fun();
		System.out.println("In Main after fun");
	}

	static void fun(){
	
		System.out.println("In fun");
		gun();
		System.out.println("In fun() after gun()");
	}
	static void gun(){
	
		System.out.println("In gun");
		System.out.println(10/0);
	}
}
