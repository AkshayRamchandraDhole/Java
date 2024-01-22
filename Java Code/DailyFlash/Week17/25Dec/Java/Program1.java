interface I{

	void num(int n);
}
class A implements I{

	public void num(int b){
	
		System.out.println("Square : "+b*b);
	}
	public static void main(String[] args){
	
		A n = new A();
		n.num(10);
	}
}
