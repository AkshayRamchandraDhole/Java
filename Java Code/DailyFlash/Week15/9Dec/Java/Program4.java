class Parent4{

}
class Child4 extends Parent4{

	Child4(){
	
		//System.out.println(this.super);
	}
	void acess(){
	
		System.out.println(this);
		//System.out.println(super);
	}

	public static void main(String[] args){
	
		Child4 c = new Child4();
	//	System.out.println(super);
		c.acess();
	}
}
