class SuperClass{

	protected SuperClass(String str){
	
		System.out.println("openAI");
	}
}
class Subclass extends SuperClass{

	private Subclass(String str){
	
		System.out.println("Neuralink");
	}
	public static void main(String arr[]){
	
		Subclass c2w = new Subclass("Clon");
	}
}
