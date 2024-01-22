class Core2web{

	Core2web(){
	
		System.out.println("In Default...");
	}
	Core2web(int a){
	
		this();
		System.out.println("In Parametrized");
	}

	public static void main(String[] args){
	
		new Core2web(10);
	}
}
