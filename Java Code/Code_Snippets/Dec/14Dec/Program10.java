class SuperClass{

	SuperClass(float version){
	
		System.out.println("Java "+version);
	}
	SuperClass(){
	
		System.out.println("Java 7.0");
	}
}
class Subclass extends SuperClass{

	 Subclass(float version){
	
		 super(version);
		System.out.println("Version set");
	}
	
	public static void main(String arr[]){
	
		new Subclass(11.0f);
	}
}
