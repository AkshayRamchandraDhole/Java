class Demo1{

	void m1(int x,float y){
	
		System.out.println("Int-Float Para");
	}
	void m1(float x,int y){
	
		System.out.println("Float-Int Para");
	}

	public static void main(String[] args){
	
		Demo1 d = new Demo1();

		d.m1(10,10.5f);
		d.m1(10.5f,10);


		//d.m1(10,10);
		//d.m1(10.5f,10.5f);
		//d.m1('A','A');
		//d.m1('A',10);



	}
}
