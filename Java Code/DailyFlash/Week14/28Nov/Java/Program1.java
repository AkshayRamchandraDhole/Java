class Demo{

	void functionCall(int a){
	
		System.out.println("Int Function");
	}
	void functionCall(float a){
	
		System.out.println("float Function");
	}
	void functionCall(char a){
	
		System.out.println("char Function");
	}
	void functionCall(String a){
	
		System.out.println("String Function");
	}

	public static void main(String[] args){
	
		Demo d = new Demo();
		d.functionCall(10);
		d.functionCall(13.5f);
		d.functionCall('A');
		d.functionCall("Akshay");
	}
}
