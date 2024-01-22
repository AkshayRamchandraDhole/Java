class Program3{

	public static void main(String ...args){
	
		int num=2,tmp=1;
		for(int row=1;row<=4;row++){

			for(int col=1;col<=row;col++){
			
				System.out.print(num+" ");
				tmp+=2;
				num+=tmp;
			}
			System.out.println();
		

		}
	}
}
