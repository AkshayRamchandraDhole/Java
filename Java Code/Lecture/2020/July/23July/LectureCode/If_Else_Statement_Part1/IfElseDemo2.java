class IfElseDemo2{

	public static void main(String args[]){
	
		int x = 10 ;
		int y = 20 ;

		// Scenario 1

		if(x++ <= y++){
		
			System.out.println("If Execute...");
			System.out.println("X="+x);
			System.out.println("Y="+y);
		}else{

			System.out.println("Else Execute...");
			System.out.println("X="+x);
			System.out.println("Y="+y);
		}

/*		// Scenario 2

		int x1 = 30 ;
		int y1 = 20 ;
                
		if(++x1 >= --y1){

                        System.out.println("If is Execute..");
			System.out.println("X1="+x1);
			System.out.println("Y1="+y1);
                }else{

                        System.out.println("Else is Execute..");
			System.out.println("X="+x);
			System.out.println("Y="+y);
		}

*/
		// Scenario 3
/*		
		int x2 = 10 ;
                int y2 = 20 ;

                if(--x2 >= y2++){

 			System.out.println("If Execute...");                      
			System.out.println("X2="+x2);
			System.out.println("Y2="+y2);
                }else{

 			System.out.println("Else Execute...");                      
			System.out.println("X2="+x2);
			System.out.println("Y2="+y2);
                      
                }
*/
		// Scenario 4
                
/*		int x3 = 10 ;
                int y3 = 20 ;

                if(x3-- > --y3){

                        System.out.println("If is Execute..");
			System.out.println("X3="+x3);
			System.out.println("Y3="+y3);
                }else{

                        System.out.println("Else is Execute..");
			System.out.println("X3="+x3);
			System.out.println("Y3="+y3);
                }
*/
		System.out.println("Out of If Else...");


	}
}
