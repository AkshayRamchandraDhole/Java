class Core2web{

	void method(Core2web var1){
	
		System.out.println("In Method1");
	}
	void method(float var2){
	
		System.out.println("In Method2");
	}
	public static void main(String[] args){
	
		Core2web c2w = new Core2web();
		c2w.method(new Core2web());
	}
}
