class Pune{

	static int covidActiveCases = 4680;
	int  totalCases  = 16815;

	static void noCorona(){
	
		System.out.println("No Corona in Pune...");
	}

	void lockdown(){
		
		totalCases = totalCases + 865;
		System.out.println("Pune TotalCases is:"+totalCases);

		covidActiveCases = covidActiveCases + 539;
		System.out.println("Pune Count of Active Cases:"+covidActiveCases);


	
	}
	void noLockdown(){

		System.out.println("No Lockdown in Pune...");
	
	}
}

class Mumbai{

	static int covidActiveCases = 36576;
	int totalCases = 92327;
	
	static void noCorona(){

		System.out.println("No Corona in Mumbai...");
	
	}

	void lockdown(){

		totalCases = totalCases + 4532;
		System.out.println("Mumbai TotalCases is:"+totalCases);

		covidActiveCases = covidActiveCases + 3546;
		System.out.println("Mumbai Count of Active Cases:"+covidActiveCases);
	
	}

	void noLockdown(){
	
		System.out.println("No Lockdown in Mumbai...");
	}

	public static void main(String arsg[]){
	
		Pune p1 = new Pune();
		p1.lockdown();

		Pune p2 = new Pune();
	       p2.lockdown();

		Mumbai m1 = new Mumbai();
 		m1.lockdown();
		
		Mumbai m2 = new Mumbai();
		m2.lockdown();		
	}
}
