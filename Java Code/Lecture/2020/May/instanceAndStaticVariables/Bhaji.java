class Bhaji{

	int bh=5;
	int tat=1;

	static int bbandh=15;

	void akBhaji(){
	
		System.out.println("Ak Bhaji");
		System.out.println("BH="+bh);
		System.out.println("Tat="+tat);
		System.out.println("BBhandh="+bbandh);

	}
	void gdBhaji(){
	
		System.out.println("GD Bhaji");
		System.out.println("BH="+bh);
		System.out.println("Tat="+tat);
		System.out.println("BBandh="+bbandh);
	}
	

	public static void main(String args[]){
	Bhaji b=new Bhaji();
	b.bbandh=0;
	b.bh=2;
	b.akBhaji();

	Bhaji b1=new Bhaji();
	b1.gdBhaji();



	}
}
