class IfElseDemo{

	public static void main(String args[]){
	
		int x = 10 ;
		int y = 20 ;

		// Scenario 1

		if(x < y){
		
			System.out.println("X is Smaller");
		}else{
		
			System.out.println("Y is Greater");
		}

		// Scenario 2

		int x1 = 30 ;
		int y1 = 20 ;
                
		if(x1 < y1){

                        System.out.println("If is Execute..");
                }else{

                        System.out.println("Else is Execute..");
		}


		// Scenario 3
		
		int x2 = 10 ;
                int y2 = 20 ;

                if(x2 > y2){

                        System.out.println("X is Smaller");
                }else{

                        System.out.println("Y is Greater");
                }

		// Scenario 4
                
		int x3 = 30 ;
                int y3 = 20 ;

                if(x3 > y3){

                        System.out.println("If is Execute..");
                }else{

                        System.out.println("Else is Execute..");
                }

		System.out.println("Out of If Else...");


	}
}
