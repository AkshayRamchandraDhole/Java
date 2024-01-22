class IfElseError{

	public static void main(String args[]){
	
		int x = 10;
		//	Scenario 1
	
		if(x == 10)
			System.out.println("If Execute...");
			System.out.println("Not inside If...");

/*		//	Scenario 2
	
		if(x == 10){
			System.out.println("If Execute...");
		}
*/
		//	Scenario 3
	
/*		if(x == 10){
			System.out.println("If Execute...");
		}
		System.out.println("Not inside If..");
*/		
		//	Scenario 2
	
/*		if(x == 10){
			System.out.println("If Execute...");
		}
		System.out.println("Not inside If..");
		else{
			System.out.println("Inside Else..");
		}*/
		//	Scenario 2
	
/*		if(x != 10){
			System.out.println("If Execute...");
		}else{
			System.out.println("Inside Else..");
		}
*/		
		System.out.println("Out of If...");
	}
}
