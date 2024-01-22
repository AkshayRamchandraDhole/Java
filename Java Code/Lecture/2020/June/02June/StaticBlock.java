
//	1) static block ha saravat pahale yet 
//	2) main
//	3) constructor we can sweep between main and constructor according to situation


class StaticBlock{

	/*StaticBlock(){
	
		System.out.println("In StaticBlock Constructor....");
	}*/
	static{
	
		System.out.println("In Static Block...");
	}

	public static void main(String args[]){
		
	//	StaticBlock s=new StaticBlock();
	
		System.out.println("In main...");
	}
}
