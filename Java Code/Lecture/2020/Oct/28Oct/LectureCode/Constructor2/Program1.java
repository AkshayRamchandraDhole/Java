class IPL{

	private String playerName="KL Rahul";
	private int runs=575;
	IPL(){
	
		System.out.println("In No arg Constructor");
		//System.out.println(this.runs);
	}
	
	IPL(String playerName,int runs){
	
		System.out.println("In paramerterized constructor");
		this.playerName=playerName;
		this.runs=runs;
	}

	void display(){
	
		System.out.println("Name="+playerName);
		System.out.println("Runs="+runs);
	}

	/*static void info(){
	
		System.out.println("Name="+this.playerName);
		System.out.println("Runs="+this.runs);
	}*/
}
class IPL2020{

	public static void main(String[] args){
	
		IPL obj1 = new IPL();
		obj1.display();
		IPL obj2 = new IPL("Mayank",550);
		obj2.display();

	}

}
