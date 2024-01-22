class Calculator{

	void addition(int a,int b){
	
		System.out.println("Addition of Two Operands is "+(a+b));
	}
	void addition(int a,int b,int c){
	
		System.out.println("Addition of Three Operands is "+(a+b+c));
	}
	public static void main(String[] args){
	
		Calculator c = new Calculator();
		c.addition(10,20);
		c.addition(10,20,30);
	}
}
