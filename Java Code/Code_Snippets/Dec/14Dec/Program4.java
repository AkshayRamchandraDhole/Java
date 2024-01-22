class SuperClass{

	SuperClass(){
	
		System.out.println("NASA");
	}
}
class Subclass extends SuperClass{

	 Subclass(){
	
		 this(100);
		System.out.println("SpaceX");
	}
	Subclass(int var){
	
		System.out.println("ISRO");
	}
	public static void main(String arr[]){
	
		Subclass c2w = new Subclass();
	}
}
