class IndianDefence{

	class Army{
	
		void attack(){
		
			System.out.println("URI Attack");
		}
	}
	class Navy{
	
		void attack(){
		
			System.out.println("Ghazi Attack");
		}
	}
	class Airforce{

		void attack(){
		
			System.out.println("Balakot Attack");
		}
	}

	public static void main(String[] args){
	
		IndianDefence ind = new IndianDefence();
		
		IndianDefence.Army army = ind.new Army();
	        army.attack();
		
		Navy navy = ind.new Navy();
		navy.attack();
		
		Airforce air = ind.new Airforce();
		air.attack();	
	}
}
