abstract class Papa{

	void getProperty(){
	
		System.out.println("Bunglow+Car");
	}
	abstract void marry();

}
class Child extends Papa{

	void marry(){
	
		System.out.println("Kriti Sanon");
	}
}
class Demo{

	public static void main(String[] args){
	
	//	Papa p = new Papa();
	
		Child c = new Child();
		c.getProperty();
		c.marry();

		Papa p = new Child();
		p.getProperty();
		p.marry();
	}
}
