class Program4{

	public static void main(String args[]){
	
		int n=5;
		int ct=n/2 +1;
		for(int row=1;row<=5;row++){
		
			for(int col=1;col<=5;col++){
			
				if((col==1 || col==5) || (row==1 || row==5))
					
					System.out.print("3 ");

				else if(row==ct && col==ct)

					System.out.print("1 ");
				else
					System.out.print("2 ");
			}
			System.out.println();
		}
	}
}
