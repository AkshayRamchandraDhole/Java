class FrndsWedding{

	void j1(int poli,int papad,String bhaji,char r){
	
		System.out.println("J1 Suru zal sobt sagl");
	}
	void j1(int poli){
	
		System.out.println("Nantr ek poli dya ho");
	}
	void j1(String bhaji,int papad){
	
		System.out.println("Nantr bhaji dya ho ani papad pn");
	}

	public static void main(String[] args){
	
		FrndsWedding fw = new FrndsWedding();
		fw.j1(1,5,"Dal",'R');
		fw.j1(2);
		fw.j1("Dal",3);
	}
}
