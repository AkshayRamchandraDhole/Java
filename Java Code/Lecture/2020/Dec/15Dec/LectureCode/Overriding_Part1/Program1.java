class Parent{

	void property(){
	
		System.out.println("Property");
	}
	/*void career(){
	
		System.out.println("Doctor");
	}
	Object career(){
	
		System.out.println("Doctor");
		return null;
	}
	 
	Numbercareer(){
	
		System.out.println("Doctor");
		return 10;
	}
	
	StringBuffer career(){
	
		System.out.println("Doctor");
		return null;
	}*/


	/*public void career(){
	
		System.out.println("Doctor");
	}*/

	protected void career(){
	
		System.out.println("Doctor");
	}
}
class Child extends Parent{

	/*void career(){
	
		System.out.println("Engg");
	}*/
	/*String career(){
	
		System.out.println("Engg");
		return null;
	}

	Integer career(){
	
		System.out.println("Engg");
		return 10;
	}

	String career(){
	
		System.out.println("Engg");
		return null;
	}*/
	
	/*void career(){
	
		System.out.println("Engg");
	}

	
	 void career(){
	
		System.out.println("Engg");
	}*/

	 void career(){
	
		System.out.println("Engg");
	}
}
class Test{

	public static void main(String[] args){
	
		Parent p = new Parent();
		p.career();
		Child c = new Child();
		c.career();
		Parent p1 = new Child();
		p1.career();
	}
}
