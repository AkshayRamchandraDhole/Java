class Program1{

	public static void main(String args[]){
	
		for(int row=0;row<3;row++){
		
			for(int space=0;space<row;space++){
			
				System.out.print("  ");
			}
			for(int col=0;col<3;col++){		
				
					System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}

/*
for(int row=1;row<=3;row++){
		
			
			for(int col=1;col<=5;col++){		
				
				if(j>=i && j - i <=2 )
					System.out.print("* ");
				else
					System.out.print(" ");
			
			}
			System.out.println();
		}

*/
