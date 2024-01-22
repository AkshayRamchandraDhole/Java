class Tree{

	protected void getData(){
	
		System.out.println("Inside Tree");
	}
}
class Fruits extends Tree{

	protected void getData(){
	
		System.out.println("Inside Fruits");
	}
}
class Test1{

	public static void main(String[] args){
	
		Tree t = new Fruits();
		t.getData();
	}
}
