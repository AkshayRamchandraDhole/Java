class VaccumTubes{

	VaccumTubes(){
	
		System.out.println(this);
	}
}
class VLSI extends VaccumTubes{

	VLSI(){
	
		super();
		System.out.println(this);
	}
}
class Transistor extends VaccumTubes{

	Transistor(){
	
		super();
		System.out.println(this);
	}

	public static void main(String[] args){
	
		VLSI v = new VLSI();
		Transistor t = new Transistor();
		VaccumTubes t1 = new VaccumTubes();	
	}
}
