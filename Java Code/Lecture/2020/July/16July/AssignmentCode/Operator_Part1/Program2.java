class Calculate{

	void addition(){
	
		int num1 = 18;
		int num2 = 10;
		int ans = 0;
		ans = num1 + num2;
		System.out.println("Addition :"+ans);
	}
	void substraction(){
	
		int num1 = 18;
		int num2 = 10;
		int ans = 0;
		ans = num1 - num2;
		System.out.println("Subtraction :"+ans);
	}
	void multiplication(){
	
		int num1 = 18;
		int num2 = 10;
		int ans = 0;
		ans = num1 * num2;
		System.out.println("Multiplication :"+ans);
	}
	void division(){
	
		int num1 = 18;
		int num2 = 10;
		int ans = 0;
		ans = num1 / num2;
		System.out.println("Divison :"+ans);
	}
	void modulus(){
	
		int num1 = 18;
		int num2 = 10;
		int ans = 0;
		ans = num1 % num2;
		System.out.println("Moduls :"+ans);
	}

	public static void main(String args[]){

		Calculate c = new Calculate();
		c.addition();
		c.substraction();
		c.multiplication();
		c.division();
		c.modulus();
	

	}
}
