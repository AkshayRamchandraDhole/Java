class Program2{

	public static void main(String arsg[]){

		int num=5;
		for(int row=1;row<=5;row++){
	
			for(int space=4;space>=row-1;space--){
			
				System.out.print(num-space+" ");
			}
			for(int col=1;col<row;col++){
			
				System.out.print(col+" ");
			}
			num++;	
			System.out.println();
		}
	}
}
