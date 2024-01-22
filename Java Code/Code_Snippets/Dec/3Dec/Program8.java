class KapilDev{

	int year = 1983;
}
class Azhar extends KapilDev{

	int year = 1998;
}
class MSDhoni extends Azhar{

	int year = 2011;
	
	void print(){
	
		System.out.println(year);
		System.out.println(super.year);
	}

	public static void main(String[] args){
	
		MSDhoni v = new MSDhoni();
		v.print();
	}
}
