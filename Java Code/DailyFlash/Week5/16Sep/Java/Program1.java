class Program1{

	public static void main(String ...args){
	
		for(char row='C';row<='S';row+=4){

			for(char col='C';col<=row;col+=4){
			
				System.out.print(col+" ");
			}
			System.out.println();
		

		}
	}
}
