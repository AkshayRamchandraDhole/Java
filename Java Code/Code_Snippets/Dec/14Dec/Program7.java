class SuperClass{

	void error(){
	
		System.out.println("101");
	}
	String err="404";
}
class Subclass extends SuperClass{

	public static void main(String arr[]){
	
		Subclass c2w = new Subclass();
		System.out.println(c2w.err);
		c2w.error();
	}
}
