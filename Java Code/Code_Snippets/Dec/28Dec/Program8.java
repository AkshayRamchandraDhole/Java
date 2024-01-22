class Core2web{


	public Core2web fun(){
	
		System.out.println("0 Argument");
		return new Core2web();
	}
	public Core2web fun(int num){
	
		System.out.println("1 Argument");
		return new Core2web();
	}
	public void fun(int num1,int num2){
	
		System.out.println("2 Argument");
	}

	public static void main(String[] args){
	
		Core2web c = new Core2web();
		c.fun();
		c.fun(1);
		c.fun(1,10);

	}
}
