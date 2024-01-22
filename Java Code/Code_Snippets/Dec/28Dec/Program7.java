class Core2web{

	static int num1=10;

	public void buy(String str){
	
		Core2web.num1+=5;
	}
}
class Child extends Core2web{

	public void buy(String str){
	
		Core2web.num1+=10;
	}
}
class Test{

	public static void main(String[] args){
	
		Core2web c = new Child();
		c.buy("demo-string");
		c.buy("demo-string");
		System.out.println(Core2web.num1);

	}
}
