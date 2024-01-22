class IPL{

	int runs = 200 ;
	String name = "Virat Kohli";

	IPL(){
	
		System.out.println("Name = "+name);
		System.out.println("Runs = "+runs);
	}
	
	public static void main(String[] args){
	
		IPL ipl2019 = new IPL();
		ipl2019.runs=300;
		IPL ipl2020 = new IPL();
	}
}
