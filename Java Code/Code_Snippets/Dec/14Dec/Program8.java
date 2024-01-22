class SuperClass{

	SuperClass(){
	
		System.out.println("Guido");
	}
}
class Subclass extends SuperClass{

	String founder(){
	
		return "James Gosling";
	}
	public static void main(String arr[]){
	
		SuperClass c2w = new SuperClass();
		System.out.println(c2w.founder());
	}
}
