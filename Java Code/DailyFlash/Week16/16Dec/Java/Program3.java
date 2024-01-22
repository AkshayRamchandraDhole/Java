/*
 * 	Why method overriding ?
 *
 * 	When child class not agree with parent class method which method has same name means overide at that time child add new functionality to that method.
 *
 * 	can we overide main method?
 *
 * 	NO, we cannnot overide main method of java because a static method cannot be override.
 *
 * */

class Parent3{

	void name(){
	
		System.out.println("Ramchandra");
	}
	public static void main(String[] args){
	

		Parent3 p = new Parent3();
		p.name();
		Child3 c = new Child3();
		c.name();
	}
}
class Child3 extends Parent3{


	public static void main(String[] args){
	
		Parent3 p = new Parent3();
		p.name();
		Child3 c = new Child3();
		c.name();
	}
}
