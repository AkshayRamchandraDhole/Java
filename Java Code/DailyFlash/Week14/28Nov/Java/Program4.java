class Demo4{

	void m1(int a){
	
		System.out.println("Int Function");
	}
	void m1(float a){
	
		System.out.println("Float Function");
	}
	public static void main(String[] args){
	
		Demo4 d = new Demo4();
		d.m1('A');// Int Function (Because int is greater than char so it check first int then check it is smaller than int so char is small so it print)
		d.m1(10.5f);
	}
}
