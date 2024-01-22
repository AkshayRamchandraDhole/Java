class TV{

	void turnOn(boolean tvRemote){
	
		System.out.println("TV On with help of tvRemote");
	}

	void turnOn(boolean tvRemote,boolean setupBox){
	
		System.out.println("TV On with help of tvRemote and setupBox");
	}

	public static void main(String[] args){
	
		TV t1 = new TV();
		t1.turnOn(true);
		t1.turnOn(true,true);

	}
}
