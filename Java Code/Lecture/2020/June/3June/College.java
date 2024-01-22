// import java.lang.*;
class College{      //extends Object

	static int principle=1;   // Static Variable
	int hod=1;	      // Instance Variable

	//Constructor
	College(){

		//super()   Object
	
		System.out.println("In College Constructor....");
	}

	// Main

	public static void main(String args[]){
	
		College c=new College(); //Constructor Call
		System.out.println("In Main....");
	}


}
