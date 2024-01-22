class Hospital{

	void getBed(){
	
		System.out.println("Normal Bed");
	}
	void getBed(String specific){
	
		System.out.println("ICU Bed");
	}
}
class Patient{

	public static void main(String[] args){
	
		Hospital h = new Hospital();
		h.getBed();
		h.getBed("ICU");
	}
}
