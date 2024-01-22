interface Parent{

	void parent();
}
interface Child extends Parent{

	void child();
}
class Test4 implements Parent,Child{

	public void parent(){
	
		System.out.println("Parent Method");
	}
	public void child(){
	
		System.out.println("Child Method");
	}
	public static void main(String[] args){
	
		Test4 y = new Test4();
		y.parent();
		y.child();
	}
}
