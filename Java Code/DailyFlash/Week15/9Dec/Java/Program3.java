class Parent3{

	int var1=10;
	float var2=18.9f;
}
class Child3 extends Parent3{

	void acess(){
	
		System.out.println(this.var1);
		System.out.println(this.var2);
	}

	public static void main(String[] args){
	
		Child3 c = new Child3();
		c.acess();
	}
}
