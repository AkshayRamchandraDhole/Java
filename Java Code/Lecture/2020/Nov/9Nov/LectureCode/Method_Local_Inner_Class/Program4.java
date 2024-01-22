class Zomato3{

	static void order(){
	
		int x=10;
		//static int y = 20;
		class Hotels3{
		
			void m1(){
			
				System.out.println(x);
				//System.out.println(y);
			}
		}
		Hotels3 h = new Hotels3();
		h.m1();
	}

	void goOut(){
	
		int x1 = 10;
		//static int y1=10;
		class Hotels4{
			int y1=20;
		
			void m1(){
			
				System.out.println(x1);
				System.out.println(y1);
			}
		}
		Hotels4 h3 = new Hotels4();
		h3.m1();
	}
	public static void main(String[] args){
	
		Zomato3 z = new Zomato3();
		//z.order();
		z.goOut();
	}
}
