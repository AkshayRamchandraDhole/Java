class Hospital{

	int x = 10;
	static int y = 20;
	static class Doctor{
	
		int p = 30;
		static int q = 40;
		void serviceAt(){
		
			System.out.println("Work at Adhar Hospital");
			System.out.println(x);
			System.out.println(y);
			System.out.println(p);
			System.out.println(q);
		}
	}

	public static void main(String[] args){
	
		Hospital h = new Hospital();
		Doctor d = h.new Doctor();
		d.serviceAt();
	}

}
