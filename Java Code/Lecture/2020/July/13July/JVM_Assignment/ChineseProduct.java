class ShareIt{

	static int uninstall_Count=1000000;
	int rating = 0; 	// out of 5

	void getRating(){
	
		System.out.println("Rating Given by User:"+rating);
	}

	static void getUnCt(){
	
		System.out.println("Uninstall Count:"+uninstall_Count);
	}

	public static void main(String args[]){

		ShareIt user1 = new ShareIt();
		user1.rating=2;
		user1.getRating();
		user1.getUnCt();

		ShareIt user2 = new ShareIt();
		user2.getRating();
		user2.uninstall_Count=2000000;
		user2.getUnCt();
	

	}
}
