class SwitchString{

	public static void main(String args[]){
	
		String s = "Akshay";
	//	 s = "akshay";
		// s = "100";
//		s = 1000; error: incompatible types: int cannot be converted to String
	/*	String s = new String("Akshay");
		String s = new String("akshay");
		String s = new String("100"); */


//		String s = new String(1000); error: no suitable constructor found for String(int)
//		StringBuffer s = new StringBuffer("akshay");error: incompatible types: StringBuffer cannot be converted to int

		switch(s){
		
			case "Akshay":
				System.out.println("Akshay Case");
				break;
			case "akshay":
				System.out.println("akshay Case");
				break;
			case "100":
				System.out.println("100 Case");
				break;
		/*	case 1000:	 error: incompatible types: int cannot be converted to String
				System.out.println("akshay Case");
				break; */



		}
	}
}
