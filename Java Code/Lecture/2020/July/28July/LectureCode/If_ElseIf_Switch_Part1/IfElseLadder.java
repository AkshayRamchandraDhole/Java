class IfLadderDemo{

	public static void main(String args[]){
	
		int x = 25 ;

	//	x = 100;
     //		x = -100 ;
    	//	x = 10 ;	
		
		// Scenario 1 :
	/*	if(x >= 0 && x <= 10){
		
			System.out.println("Number is between 0 and 10");
		}else{
		
			System.out.println("Number is greater than 10");
		} */

		// Scenario 2 :
	
		if(x >= 0 && x <= 10){
		
			System.out.println("Number is between 0 and 10");
		}else if(x >= 10 && x<=20){
		
			System.out.println("Number is between 10 and 20");
		}else if(x >= 20 && x <= 30){
		
			System.out.println("Number is between 20 and 30");
		}else if(x >= 30){
		
			System.out.println("Number is greater than 30");
		}else{
		
			System.out.println("Please Enter Positive Number..");
		}
	}
}
