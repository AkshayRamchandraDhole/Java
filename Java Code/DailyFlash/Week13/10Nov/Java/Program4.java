class Restaurant2{

	class College{
	
		class CompDept{

			class ItDept{
			
				void inIt(){
				
					System.out.println("In IT Dept class Method");
				}
			}
		
			void inComp(){
			
				System.out.println("In Comp Dept Class Method");
			}
		}
		void inCollege(){
		
			System.out.println("In College Class Method");
		}
	}
	void inRestaurant2(){
	
		System.out.println("In Restaurant2 Class Method");
	}
}
class Main4{

	public static void main(String[] args){
	
		Restaurant2 r = new Restaurant2();
		r.inRestaurant2();
		
		Restaurant2.College rc = r.new College();
		rc.inCollege();
		
		Restaurant2.College.CompDept rcc = rc.new CompDept();
		rcc.inComp();
		
		Restaurant2.College.CompDept.ItDept rcci = rcc.new ItDept();
		rcci.inIt();
	}
}
