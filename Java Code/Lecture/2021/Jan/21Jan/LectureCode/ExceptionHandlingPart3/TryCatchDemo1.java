class TryCatchDemo1{

	public static void main(String[] args) {
	
		System.out.println("Before Exception Occurs");
		TryCatchDemo1 obj = null;
		try{
		
			obj.fun();

		}catch(NullPointerException e){
		
		}

		System.out.println("After Exception Occurs");
	}
	void fun(){
	
		System.out.println("In Fun");
	}
}
