class Parent2{

	Parent2(){
	
		System.out.println(this);
	}
}
class Child2 extends Parent2{

	Child2(){
	
		super();
		//System.out.println(this);
	}

	public static void main(String[] args){
	
		Child2 c = new Child2();
	}
}
