class Zomato{

	void order(){
	
		System.out.println("In Order Method");

		class Hotels{
		
			String hotelName = null;

			Hotels(String hotelName){
			
				this.hotelName = hotelName;
			}

			void orderPlaced(){
			
				System.out.println("Order placed at = "+hotelName);
			}
		}

		Hotels h = new Hotels("GreenPark");
		h.orderPlaced();

	}

	void goOut(){
	
		System.out.println("In goOut Method");
		class Xyz{
		
			class Pqr{
			
				void inPqr(){
				
					class Lmn{
					
					}
				}
			}
		}
	}

	public static void main(String[] args){
	
		Zomato z = new Zomato();
		z.order();
		
		//Hotels h = new Hotels();
	}

}
