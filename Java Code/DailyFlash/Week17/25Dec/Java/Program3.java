interface Appartment{

	void oneBHK();
	void twoBHK();
	void oneRK();
}
class Builder implements Appartment{

	public void oneBHK(){
	
		System.out.println("1 BHK");
	}
	public void twoBHK(){
	
		System.out.println("2 BHK");
	}
	public void oneRK(){
	
		System.out.println("1 RK");
	}
	public static void main(String[] args){
	
		Builder b = new Builder();
		b.oneBHK();
		b.twoBHK();
		b.oneRK();
	}

}
