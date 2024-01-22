interface VaccineRegulatoryAuthority{

	void correctVac();
}
class Pfizer implements VaccineRegulatoryAuthority{

	public void correctVac(){
	
		System.out.println("Pfizer vaccine 85% Patients recover");
	}
}
class Moderna implements VaccineRegulatoryAuthority{

	public void correctVac(){
	
		System.out.println("Moderna Vaccine 95% Patients recover");
	}
}
class BioNTect implements VaccineRegulatoryAuthority{

	public void correctVac(){
	
		System.out.println("BioNTech vaccine 75% Patients recover");
	}
}
class Test2{

	public static void main(String[] args){
	
		Pfizer p = new Pfizer();
		p.correctVac();
		Moderna m = new Moderna();
		m.correctVac();
		BioNTect b = new BioNTect();
		b.correctVac();
	}
}
