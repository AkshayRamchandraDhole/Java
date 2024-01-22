class Mall{

	class Food{
	
		class Shopping{
		
			void inShopping(){
			
				System.out.println("In Shopping Class Method");
			}
		}
		void inFood(){
		
			System.out.println("In Food Class Method");
		}
	}
	void inMall(){
	
		System.out.println("In Mall Class Method");
	}
}
class Main5{

	public static void main(String[] args){
	
		Mall m = new Mall();
		m.inMall();
		
		Mall.Food mf = m.new Food();
		mf.inFood();
		
		Mall.Food.Shopping mfs = mf.new Shopping();
		mfs.inShopping();
	}
}
