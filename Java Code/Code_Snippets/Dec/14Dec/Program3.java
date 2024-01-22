class SuperClass1{

	protected SuperClass1(){
	
		System.out.println("ReactJS");
	}
}
class SuperClass2{

	protected SuperClass2(){
	
		System.out.println("Spring");
	}
}
class Subclass extends SuperClass1,SuperClass2{

	private Subclass(){
	
		System.out.println("Assembly");
	}
	public static void main(String arr[]){
	
		Subclass c2w = new Subclass();
	}
}
