class Core2web{

	int var1 = 10;
	Core2web(){
	
		System.out.println("In Constructor");
	}
	int getVar1(){
	
		return var1;
	}
	int getVar1(int var1){
	
		return var1;
		//System.out.println("In getVar1()");
		//System.out.println(var1);
	}
	public static void main(String[] args){
	
		Core2web c2w = new Core2web();
		System.out.println(c2w.getVar1());
		System.out.println(c2w.getVar1(20));
	}
}
