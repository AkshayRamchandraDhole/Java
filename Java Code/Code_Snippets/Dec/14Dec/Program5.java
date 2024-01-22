class SuperClass{

	private SuperClass(){
	
		System.out.println("Private");
	}
	void displayMsg(){
	
		System.out.println("Core2web");
	}
}
class Subclass extends SuperClass{

	public static void main(String arr[]){
	
		Subclass c2w = new Subclass();
		c2w.displayMsg();
	}
}
