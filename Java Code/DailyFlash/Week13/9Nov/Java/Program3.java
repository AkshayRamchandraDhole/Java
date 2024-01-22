class CarModel{

	String modelName = "Brezza";

	void getModel(){
	
		System.out.println("Model Name : "+modelName);
	}
	CarModel(String str){
	
		System.out.println("Model Name : "+str);
	}

	public static void main(String[] args){
	
		CarModel s = new CarModel("Venue");
		s.getModel();
	}
}
