interface Yewale{

	void makingTea();
	//public abstract void makingTea();
	
	// after 1.7 
	 default void creamRolls(){
	 
		 System.out.println("Own CreamRolls");
	 }
}
class PuneYewale implements Yewale{

	public void makingTea(){
	
		System.out.println("Starts at 5 am");
		System.out.println("Best Tea");
	}

}
class BaramatiYewale implements Yewale{

	public void makingTea(){
	
		System.out.println("Starts at 7 am");
		System.out.println("Best Tea");
	}
}
class Sukh{

	public static void main(String[] args){
	
	//	Yewale y = new Yewale();
		Yewale y = new PuneYewale();
		y.makingTea();
		//Yewale.creamRolls();
		y.creamRolls();
		
		Yewale y1 = new BaramatiYewale();
		y1.makingTea();
		y1.creamRolls();
	}
}
