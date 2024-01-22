/*  three ways
 *
 *	1) by making method final in the base 
 *	2) by making method static in the base
 *	3) by making a method private in the base
 *
 * */
class Parent4{

	/*final void name(){
	
		System.out.println("Ramchandra");
	}
	static void name(){
	
		System.out.println("Ramchandra");
	}*/

	private void name(){
	
		System.out.println("Ramchandra");
	}
}
class Child4 extends Parent4{

	public void name(){
	
		System.out.println("Akshay");
	}
}
class Test4{

	public static void main(String[] args){
	
		Parent4 p = new Parent4();
		p.name();
		Child4 c = new Child4();
		c.name();
	}
}
