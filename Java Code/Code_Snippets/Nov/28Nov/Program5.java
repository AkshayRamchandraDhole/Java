class Core2web{

	static int var=10;
	Core2web(int var1){
	
		var=var1;
	}
	public static void main(String[] args){
	
		Core2web d = new Core2web(100);
		System.out.println("Var1="+var);
		System.out.println("Var2="+d.var);
		
	}
}
