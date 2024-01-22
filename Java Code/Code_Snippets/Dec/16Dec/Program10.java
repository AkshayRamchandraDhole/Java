class Parent{

	private void grapes(){
	
		System.out.println("IN Parent grapes");
	}
}
class Child extends Parent{

	
	private void grapes(){

		System.out.println("In Child grapes");
	}
}
class Core2web{

	public static void main(String[] args){
	
		Parent p = new Parent();
		p.grapes();
	}
}
