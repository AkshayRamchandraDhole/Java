class Program1{

	public static void main(String arsg[]){
		int num=1;
		for(int row=1;row<=5;row++){
	
			for(int col=1;col<=row;col++){
		
				System.out.print(num+" ");
				num--;	
			}
			num=row+1;
				
			System.out.println();
		}
	}
}
