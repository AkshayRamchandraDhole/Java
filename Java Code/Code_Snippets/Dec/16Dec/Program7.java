class Parent{

	int var1=10;
	String var2="Core2web";
	Parent(int var1,String var2){
	
		this.var1=var1;
		this.var2=var2;
	}
}
class Child extends Parent{

	Child(int var1,String var2){
	
		super(var1,var2);
	}
	public static void main(String[] args){
	
		Child c = new Child(10,"Predator");
		c.var1=c.var1+1;
		System.out.println(c.var1);
	}
}
