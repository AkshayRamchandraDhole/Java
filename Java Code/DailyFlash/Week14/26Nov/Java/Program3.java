class GrandParent{

	int x = 10;
}
class Parent extends GrandParent{

	int y = 20;
}
class Child extends Parent{

	void addition(){
	
		System.out.println("Addition = "+(x+y));
	}

	public static void main(String[] args){
	
		Child c = new Child();
		c.addition();
	}
}

