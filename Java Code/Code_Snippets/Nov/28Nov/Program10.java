class Core2web{

	int var=10;
	Core2web(int var){
	
		var=var;
	}
	int get(){
	
		return var;
	}
	public static void main(String[] args){
	
		Core2web d = new Core2web(100);
		System.out.println(d.get());
	}
}
