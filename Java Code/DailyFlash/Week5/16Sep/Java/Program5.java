class Program5{

	public static void main(String ...args){
	
	
		int tmp=1;
		for(int row=1;row<=10;row++){

			if(row>5){
				for(int col=1;col<=tmp;col++){
				
					System.out.print("* ");
				}
				tmp++;
			}else{
			
				for(int col=5;col>=row;col--){
				
					System.out.print("= ");
				}
			}
			System.out.println();
		

		}
	}
}
