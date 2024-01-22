class Home{

	static String tv="ONIDA";
	static String m="RealMe";
		int mob=1;
	
	static void tvPahane(){
	
		System.out.println("TV Pahane...");
		System.out.println(tv);

		Home h=new Home();

		System.out.println(h.mob);
	}

	void lecturePahane(){
	
		System.out.println("Lecture Pahane...");
		System.out.println(m);
		System.out.println(mob);

	}

	public static void main(String args[]){

		tvPahane();
		Home h=new Home();
		h.lecturePahane();
	

	}
}
