class Trip{

	Trip(){
	
		System.out.println("In Trip Constructor....");
	}
	void place(){
	
		System.out.println("Ooohhh Goa!!!");
	}
	
}
class Today{

	public static void main(String[] args){
	
		Trip t = new Trip(){
		
			void place(){
			
				System.out.println("^^^Alibaug");
			}
			/*void m1(){
			
				System.out.println("M1()");
			}*/
		};
		t.place();
		//t.m1();

		//Trip t1 = new Trip(){};
	}
}
