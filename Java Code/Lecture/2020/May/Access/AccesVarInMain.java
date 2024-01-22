class ODI{

	static String capt="Rohit Sharma";
		int toss=0;

	static void list(){
	
		System.out.println("Player List");
	}
	void batORBowl(){
	
		System.out.println("Decision");
	}

	public static void main(String args[]){
	
		System.out.println(capt);
		//System.out.println(toss);//error: non-static variable toss cannot be referenced from a static context
		
		ODI o=new ODI();

		System.out.println(o.toss);

	}
}
