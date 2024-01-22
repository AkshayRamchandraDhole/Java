class Core2web{

	Core2web(){
	
		System.out.println("Default Argument");
	}
	Core2web(int var1){

		System.out.println("One Argument");
	}
	Core2web(int var1,int var2){

		this();
		this(10);
		System.out.println("Two Argument");
	}
	public static void main(String[] args){
	
		Core2web c2w = new Core2web(10,20);
	}
}

