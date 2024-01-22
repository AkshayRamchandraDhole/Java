class Home{
	

	static int fan=1;  //Static Variable
	
	int pen=1;	// Instance Variable

	//Constructor

	Home(){
	
		System.out.println("In Home Constructor.....");
	}

	// Instance Method 
	
	void coding(){
		int x=10;
	
		System.out.println("Coding chalu ahe...");
		System.out.println("Fan:"+fan);
		System.out.println("Pen:"+pen);

	}

	//Static Method

	static void tv(){
		//static int y=10;

		Home h = new Home();
		System.out.println("Tv Chalu ahe....");	
		System.out.println("Fan:"+fan);
		System.out.println("Pen:"+h.pen);
	}

	//Static Block

	static{
		Home h = new Home();	
		System.out.println("Static Block");
		System.out.println("Fan:"+fan);
		System.out.println("Pen:"+h.pen);
	}

	public static void main(String args[]){

		System.out.println("In Main....");
		Home h=new Home(); // In Home Constructor...

		h.coding();  // Coding Chalu ahe...

		tv(); //  Tv Chalu ahe...

		Home.tv(); // Tv Chalu ahe...

		h.tv(); // Tv Chalu ahe...
	}

}
