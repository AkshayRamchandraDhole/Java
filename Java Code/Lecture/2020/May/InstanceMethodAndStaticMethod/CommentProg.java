class Kutu1{

	int mob=1;
	int lap=1;
	static int tv=1;

	void display(){
	
		System.out.println("In Display...");
	}

	static void statDisplay(){
	
		System.out.println("In StatDisplay....");
	}

	static public void main(String args[]){
	
		Kutu1 k1=new Kutu1();
		k1.display();
		k1.statDisplay();

		Kutu1 k2=new Kutu1();
		k2.display();
		k2.statDisplay();
	}
}
