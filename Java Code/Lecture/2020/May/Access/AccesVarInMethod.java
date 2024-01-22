class Test{

	static String no1="Steve Smith";
		int bat=1;
	
	static void no1Player(){
	
		System.out.println("No 1 Player....");
		System.out.println(no1);
		//System.out.println(bat);//error: non-static variable bat cannot be referenced from a static context
		
		Test t=new Test();

		System.out.println(t.bat);
		//t.batNO();

	}

	void batNO(){
	
		
		System.out.println("No 1 Test Player");
		System.out.println(no1);
		System.out.println(bat);
		//no1Player();
	}

	public static void main(String args[]){
	
		no1Player();
		Test t=new Test();
		t.batNO();
	}
}
