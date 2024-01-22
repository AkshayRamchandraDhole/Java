class Restaurant{

	class Drink{
	
		class Food{
		
			void inFood(){
			
				System.out.println("In Food Class Method");
			}
		}
		void inDrink(){
		
			System.out.println("In Drink Class Method");
		}
	}
	void inRestaurant(){
	
		System.out.println("In Restaurant Class Method");
	}
}
class Main1{

	public static void main(String[] args){
	
		Restaurant r = new Restaurant();
		r.inRestaurant();
		
		Restaurant.Drink rd = r.new Drink();
		rd.inDrink();
		
		Restaurant.Drink.Food rF = rd.new Food();
		rF.inFood();
	}
}
