class Parent5{

	int var1=10;
	float var2=18.9f;

	/*Parent5(){
	
		System.out.println("Parent");
	}*/
}
class Child5 extends Parent5{

	int var3=100;
	float var4=16.7f;
	void acess(){
	
		System.out.println(super.var1);
		System.out.println(super.var2);
		
		System.out.println(this.var3);
		System.out.println(this.var4);
	}

	public static void main(String[] args){
	
		Child5 c = new Child5();
		//c.acess();
	}
}
