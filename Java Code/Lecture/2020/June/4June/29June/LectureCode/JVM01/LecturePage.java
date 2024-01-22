class LecPage{

	int pageNo=10;

	void lecPahal(){
	
		System.out.println("Lecture Paha Roj..");
		System.out.println("PageNo="+pageNo);
	}
	static void jvmLec(){
	
		System.out.println("Template of JVM");
	}

	public static void main(String args[]){
	
		LecPage l1 = new LecPage();
		l1.lecPahal();
		l1.jvmLec();

		LecPage l2 = new LecPage();
		l2.pageNo=13;
		l2.lecPahal();
		
	}

}
