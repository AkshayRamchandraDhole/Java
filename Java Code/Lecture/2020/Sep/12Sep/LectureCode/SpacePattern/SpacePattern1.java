class SpacePattern1{

	public static void main(String args[]){
	
		for(int row=1;row<=4;row++){
		
			for(int space=3;space>=row;space--){
			
				System.out.print("  ");
			}

			for(int col=1;col<=row;col++){
			
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}