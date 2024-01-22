class Demo{

	void test(Integer i){
	
		System.out.println("test(Integer i)");
	}
	void test(String name){
	
		System.out.println("test(String [] args)");
	}
	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.test(null);
	}
}
