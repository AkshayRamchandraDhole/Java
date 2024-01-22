class House{

	class Flat{
	
		class Kitchen{
		
			void inKitchen(){
			
				System.out.println("In Kitchen Class Method");
			}
		}
		void inFlat(){
		
			System.out.println("In Flat Class Method");
		}
	}
	void inHouse(){
	
		System.out.println("In House Class Method");
	}
}
class Main3{

	public static void main(String[] args){
	
		House h = new House();
		h.inHouse();
		
		House.Flat hf = h.new Flat();
		hf.inFlat();
		
		House.Flat.Kitchen hfk = hf.new Kitchen();
		hfk.inKitchen();
	}
}
