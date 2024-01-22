class Core2web{

	static{
	
		Core2web c2w = new Core2web();
	}

	String str =  Core2web.fun();

	static String fun(){
	
		System.out.println("FUN");
		return "fun";
	}

	public static void main(String[] args){
	
		System.out.println("Main");
	}
	Core2web(){
	
		System.out.println("Constructor");
	}
}
