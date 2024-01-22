class T20{

	static String capt="Virat Kholi";
		int toss=0;
	
		static void list(){
		
			System.out.println("Player List");
		}
		
		void batORBowl(){
		
			System.out.println("Decision");
		}

		public static void main(String args[]){
			list();//Player List
			//batORBowl();//error: non-static method batORBowl() cannot be referenced from a static context

			T20 t=new T20();
			t.batORBowl();
		

		}
}
