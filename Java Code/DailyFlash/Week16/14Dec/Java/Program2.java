class Mobile{

	void openLock(){
	
		System.out.println("Using FingerPrint");
	}
	int openLock(int pass){
	
		System.out.println("Using Entering Number Password");
		return pass;
	}
	void openLock(String str1,String str2){
	
		System.out.println("Using String Password or FaceLock");
	}
	public static void main(String[] args){
	
		new Mobile().openLock();
		new Mobile().openLock(123456);
		new Mobile().openLock("Akshay","Face");
	}
}
