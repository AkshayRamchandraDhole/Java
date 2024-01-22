class Parent{

	Parent(){
	
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{

	Child(){
	
		//super(); // here by default super() line present in construtor
		System.out.println("Child Constructor");
	}

	public static void main(String[] args){
	
		Child c = new Child();
	}
}
