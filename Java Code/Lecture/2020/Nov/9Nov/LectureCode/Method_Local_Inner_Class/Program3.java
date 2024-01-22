class Zomato1{

	int x = 10;
	static int y = 20 ;

	static void order(){
	
		//System.out.println(x);//
		System.out.println(y);

		class Hotels1{
		
			void m1(){
			
				//System.out.println(x);
				System.out.println(y);

				class Check{
				
					void m2(){
					
						class Check2{
						
						}
					}
				}
			}
		}
		Hotels1 h1 = new Hotels1();
		h1.m1();
	}

	void goOut(){
	
		System.out.println(x);
		System.out.println(y);

		class Hotels2{
		
			void m1(){
			
				System.out.println(x);
				System.out.println(y);
			}
		}

		//Hotels2 h2 = new Hotels2();
		//h2.m1();	
	}

	public static void main(String[] args){
	
		order();
		Zomato1 z = new Zomato1();
		//z.goOut();
	}
}
