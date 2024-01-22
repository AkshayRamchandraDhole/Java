class Program3{

	public static void main(String args[]){
		int num=5,tmp=2;
		for(int row=1;row<=5;row++){
	
			for(int col=1;col<=row;col++){
			
				System.out.print(num*num+" ");
				num++;
			
			}
			num-=tmp;
			tmp++;
			System.out.println();
		}
	}
}
