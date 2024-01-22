class Parent{

	Parent(){
	
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("Child Constructor");
	}
	public static void main(String[] args){
	
		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();
		//Trip t = new Trip(){  
			
			// anonymous inner class body 

		// };
	}
}
