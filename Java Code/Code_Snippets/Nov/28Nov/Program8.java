class Core2web{

	Core2web(){
	
		System.out.println("Normal Constructor");
	}
	Core2web(float f){
	
		System.out.println("Float Constructor");
	}

	public static void main(String[] args){
	
		Core2web d = new Core2web(10);
		
	}
}
