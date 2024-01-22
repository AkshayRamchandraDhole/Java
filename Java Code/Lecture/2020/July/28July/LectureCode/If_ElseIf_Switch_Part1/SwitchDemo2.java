class SwitchDemo2{

	public static void main(String args[]){
	
		int var = 10 ;

	//	var = 5 ;
     	//	var = -10 ;
     	//	var = 12 ; 
		
		System.out.println("Before Switch");
		switch(var){

		/*	default : 
				System.out.println("In Default");
				break;*/

		
			case 1 :
				System.out.println("One");
				break;
			case 2 :
				System.out.println("Two");
				break;
			case 3 :
				System.out.println("Three");
				break;
			case 4 :
				System.out.println("Four");
				break;
			case 5 :
				System.out.println("Five");
				break;
			case 6 :
				System.out.println("Six");
				break;
			
		/*	default : 
				System.out.println("In Default");
				break;*/
			
			case 7 :
				System.out.println("Seven");
				break;
			case 8 :
				System.out.println("Eight");
				break;
			case 9 :
				System.out.println("Nine");
				break;
			case 10 :
				System.out.println("Ten");
				break;
			default : 
				System.out.println("In Default");
				break;
		}

		System.out.println("After Switch");
	}
}
