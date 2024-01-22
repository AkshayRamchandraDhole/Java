class Core2web{

	int var1 ;
	Core2web(){
	
		var1=10;
		//System.out.println("In Constructor");
	}
	void getClass(){
	
		System.out.println("getClass "+"Core2web");
	}
	String getClass(float num){
	
		System.out.println("getClass "+"Core2web");
		return new String("BiEncaps");
		//System.out.println(var1);
	}
	public static void main(String[] args){
	
		Core2web c2w = new Core2web();
		//System.out.println(c2w.getVar1());
		System.out.println(c2w.getClass(45));
	}
}
