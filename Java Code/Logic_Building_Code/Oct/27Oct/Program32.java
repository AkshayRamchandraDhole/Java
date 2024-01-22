class Program32{

	public static void main(String[] args){
	
		//rows
		for(int row=1;row<=5;row++){
		
			//spaces 

			for(int space=4;space>=row;space--){
			
				System.out.print("  ");
			}

			//cols

			for(int col=1;col<=row;col++){
			
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
