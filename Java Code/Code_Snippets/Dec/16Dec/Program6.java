class Parent{

	int var1=10;
	String var="Core2web";
}
class Child extends Parent{

	
	public static void main(String[] args){
	
	new Child().var1=new Child().var1+1;
		System.out.println(new Child().var1);
	}
}
