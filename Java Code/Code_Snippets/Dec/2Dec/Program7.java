class Core2web{

	Core2web(){
	
		System.out.println("Default Argument");
	}
	Core2web(int var1){
	
		this(10);
		System.out.println("Two Argument");
	}
	public static void main(String[] args){
	
		Core2web c2w = new Core2web(10);
	}
}

