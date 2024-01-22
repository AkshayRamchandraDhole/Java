class SuperClass{

	void displayMsg(){
	
		System.out.println("Core2web");
	}
}
class Subclass{

	Subclass(){
	
		System.out.println("Subclass");
	}
	public static void main(String arr[]){
	
		Subclass c2w = new Subclass();
		c2w.displayMsg();
	}
}
