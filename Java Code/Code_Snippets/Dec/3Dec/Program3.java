class Biencaps{

	Biencaps(){
	
		System.out.println("You are in Biencaps constructor");

	}
}
class Core2web extends Biencaps{

	Core2web(){
	
		System.out.println("You are in Core2web constructor");
		super();
	}
}
class Demo{

	public static void main(String[] args){
	
		Biencaps be = new Biencaps();
		Core2web c2w = new Core2web();
	}
}
