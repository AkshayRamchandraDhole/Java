class Doctor{

	String drName="MK Shah";
	int numHospital=7;

	void operation(){
	
		System.out.println("Doctor Name : "+drName);
		System.out.println("Specialist in Brain Surgery");
	}
}
class Hospital{

	String hName = "Sancheti";
	int numDoc=93;

	Doctor d = new Doctor();
	
	void service(){
	
		System.out.println("Hospital Name : "+hName);
		System.out.println("Number of Doctors : "+numDoc);
		System.out.println("Good Service");
		visitorDoctors();
	}
	void visitorDoctors(){
	
		d.operation();
	}	
}
class Patient{

	public static void main(String[] args){
	
		Hospital h = new Hospital();
		h.service();
	}
}
