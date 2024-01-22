class Core2web{

	void method(double var1){
	
		System.out.println("In Method1");
	}
	void method(int... var2){
	
		System.out.println("In Method2");
	}
	public static void main(String[] args){
	
		Core2web c2w = new Core2web();
		c2w.method(10);
	}
}
