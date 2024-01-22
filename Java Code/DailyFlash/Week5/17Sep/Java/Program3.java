class Program3{

	public static void main(String arsg[]){
		int num=1;
		for(int row=1;row<=5;row++){
	
			for(int col=1;col<=5;col++){
				
				if(row==1 || row==5 )
					System.out.print(row+" ");
				else{
				
					if(col<=2)
						System.out.print(row+" ");
				}		
			}
				
			System.out.println();
		}
	}
}
