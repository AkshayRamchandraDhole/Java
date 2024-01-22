class Kutumb{

	int mob=1;
	int lap=1;
	static int tv=1;
	
	void display(){
	
		System.out.println("In Display....");
	}

	public static void main(String args[]){
	
		//display();//error: non-static method display() cannot be referenced from a static context

		Kutumb k=new Kutumb();
		k.display();
	}
}
