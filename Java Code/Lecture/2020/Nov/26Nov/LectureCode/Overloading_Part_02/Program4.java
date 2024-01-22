class Demo4{

	void m1(int x){
	
		System.out.println("Int Method");
	}
	void m1(int x,int y){
	
		System.out.println("Two Int Method");
	}
	
	void m1(int ... varargs){
	
		System.out.println("VarArgs Int Method");
	}

}
class Test2{

	public static void main(String[] args){
	
		Demo4 d = new Demo4();
		d.m1();
		d.m1(10);
		d.m1(10,20);
		d.m1(10,20,30);
		d.m1('A','B',20);
		d.m1('A');
		d.m1('A','B');
		d.m1('A',10);
		d.m1(10,'A',10,'A');
	}
}
