class Core2web{

	int var=10;
	Core2web(int var){
	
		this.var=var;
	}
	Core2web(Core2web c2w){
	
		this.var=var;
	}
	public static void main(String[] args){
	
		Core2web d = new Core2web(100);
		Core2web d1 = new Core2web(d);
		System.out.println("Var1="+d.var);
		System.out.println("Var2="+d1.var);
		
	}
}
