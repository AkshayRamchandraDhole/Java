class Kam{

	void coding(){
	
		System.out.println("In Coding....");
	}

	static void paniBhar(){
	
		System.out.println("In Pani Bhar...");
	}
}

class CallKam{

	public static void main(String args[]){
	
		//paniBhar();// error: cannot find symbol
		//coding();// error: cannot find symbol

		Kam.paniBhar();
		//Kam.coding();// error: non-static method coding() cannot be referenced from a static context
		
		Kam k=new Kam();
		k.coding();
		
		//Kam a=null;
		//a.paniBhar(); //In PaniBhar...
		//a.coding(); //Exception in thread "main" java.lang.NullPointerException
						//at CallKam.main(TwoClass.java:29)
	}
}
