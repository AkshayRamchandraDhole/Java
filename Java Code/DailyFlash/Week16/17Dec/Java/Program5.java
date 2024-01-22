class Mall{

	 void picture(){
	
		System.out.println("Dil Bechara");
	}
}
class Threatre extends Mall{

	 void picture(){
	
		System.out.println("Good News");
	}
}
class Test5{

	public static void main(String[] args){
	
		Threatre t = new Threatre();
		t.picture();
	}
}
