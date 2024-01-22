class AddDemo{

	void add(int x,int y){
	
		System.out.println(x+y);
	}
	void add(int x,int y,int z){
	
		System.out.println(x+y+z);
	}
	public static void main(String[] args){
	
		AddDemo ad = new AddDemo();
		ad.add(10,20,30);
		ad.add(10,20);
		//ad.add(10);
		ad.add('A','K','S');
		ad.add('A','K');
		ad.add(10l,20l);

	}
}
