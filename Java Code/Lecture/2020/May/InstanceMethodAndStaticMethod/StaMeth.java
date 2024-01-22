class Kutu{

	int mob=1;

	static int tv=1;

	static void statDisplay(){
		int a=10;
		//static int b; //Error:illigle start of expression 
	
		System.out.println("In StatDisplay....");
	}

	/* void display(){
	
		int a=10;
		static int b=10;// Error: Illigle start of expression
	}*/

	public static void main(String args[]){
	
		//statDisplay();// In StatDisplay

		Kutu.statDisplay();// In StatDisplay
	
		//Kutu k=new Kutu();
	//	k.statDisplay();// In StatDisplay
	}
}
