class Biencaps{

	Biencaps(int a){
	
		System.out.println("You are in Biencaps constructor");

	}
}
class Core2web extends Biencaps{

	Core2web(){
	
		System.out.println("You are in Core2web constructor");
	}
}
class Demo{

	public static void main(String[] args){
	
		Core2web c = new Core2web();
	}
}
